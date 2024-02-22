import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BasicArray {
    public static void main(String[] arg)
    {
        // int[]arr1 = new int[5];

        // System.out.println(arr1[0]);
        // System.out.println(arr1);
        Scanner input = new Scanner(System.in);
        // int arr1[] = new int[10];
        // for(int i = 0;i<arr1.length;i++)
        // {
        //     // take input and store into arr1
        //     System.out.println("Enter "+i+" th number");
        //     arr1[i] = input.nextInt();
        // }

        // for(int i = 0;i<arr1.length;i++)
        // {
        //     System.out.print(arr1[i]+" ");
        // }

        // int arr2[]={1 , 2, 3 , 4 , 5};
        // System.out.println(Arrays.toString(arr2));
        
        int arr3 [][]={
            {1 , 2 , 3},
            {4 , 5},
            {9}
        };

        for(int arr[]:arr3)
        {
            System.out.println(Arrays.toString(arr));
        }
    }

}
