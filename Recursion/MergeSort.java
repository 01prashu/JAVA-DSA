import java.util.*;
public class MergeSort {
    public static void main(String[]arg)
    {
        int[]arr={12 , 5 , 8 , 11 , 7 , 6 , 8 , 2 , 4 , 2, 2};
        MergeSortAlgo(arr, 0, arr.length-1);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }   
    static void Merge(int[]arr , int low , int mid , int high)
    {
        int left = low;
        int right = mid+1;
        int temp[] = new int[(high-low)+1];
        int i = 0;
        while(left <= mid && right <=high)
        {
            if(arr[left]<arr[right])
            {
                temp[i++] = arr[left++];
                
            }
            else{
                temp[i++] = arr[right++];
               
            }
        }
        
        while(left<=mid)
        {
            temp[i++]=arr[left++];
            
        }
        while(right<=high)
        {
            temp[i++] = arr[right++];
            
        }
        for(int j = low ;j<=high;j++)
        {
            arr[j] = temp[j-low];
        }

    }
    static void MergeSortAlgo(int[]arr, int low , int high)
    {
        if(low>=high)return;
        int mid = (low+high)/2;
        MergeSortAlgo(arr, low, mid);
        MergeSortAlgo(arr, mid+1, high);
        Merge(arr , low , mid , high);
    }
}
