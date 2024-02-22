import java.util.*;
public class LinearSearch {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        int size =0;
        int target = 0;
        System.out.println("Enter the size of an array");
        size = input.nextInt();
        int arr1[] = new int[size];
        for(int i = 0;i<arr1.length;i++)
        {
            System.out.println("Enter the "+i+" th element");
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the Target Element");
        target = input.nextInt();

        boolean result = LinearSerach(arr1 ,target );

        if(result)System.out.println("Target is found");
        else System.out.println("Target not found");
    }
    static boolean LinearSerach(int arr1[] , int target)
    {
        for(int m:arr1)
        {
            if(m == target)return true;
        }
        return false;
    }
}
