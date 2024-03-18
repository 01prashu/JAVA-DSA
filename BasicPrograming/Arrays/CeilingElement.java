import java.util.Scanner;
public class CeilingElement {
    public static void main(String []arg)
    {
        int[] arr={12 , 14 , 34 , 36 , 72 ,78};
        int target = 11;
        int ceil_pos = GetCeilPos(arr , target);
        if(ceil_pos == -1)
        {
            System.out.println(target +" Is not present in Array");
        }
        System.out.println(arr[ceil_pos]);
    }
    static int GetCeilPos(int[] arr , int target)
    {
        int low = 0 , high = arr.length -1 , mid = low +(high - low)/2;
        while(low <= high)
        {
            if(arr[mid] == target)return mid;
            else if(arr[mid] >= target && arr[mid-1]<=target && mid-1>=0 )return mid;
            else if(arr[mid]< target) low = mid+1;
            else high = mid -1;

            mid = low +(high -low)/2;
        }
        return -1;
    }
}
