import java.util.*;
public class BinarySearch {
    public static void main(String [] arg)
    {
        Scanner input = new Scanner(System.in);
        int target = 0 , size = 0;
        System.out.println("Enter the size of an array");
        size = input.nextInt();
        int arr1[] = new int[size];
        for(int i = 0;i<arr1.length;i++)
        {
            System.out.println("Enter "+i+" th Element");
            arr1[i] =input.nextInt();
        }
        System.out.println("Enter the target");
        target = input.nextInt();
        int position = BinarySearch(arr1  , target);
        if(position == -1)System.out.println("Target not found");
        else System.out.println("Target found at "+position);
    }
    static int BinarySearch(int arr1[] , int target)
    {
        for(int i = 0;i<arr1.length;i++)
        {
            if(arr1[i] == target)return i;
        }
        return -1;
    }
}
