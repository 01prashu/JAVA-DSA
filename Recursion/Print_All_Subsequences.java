import java.util.*;
public class Print_All_Subsequences {
    public static void main(String[]arg)
    {
        // System.out.println("hello");
        int[]arr ={1 , 2  , 3};
        Generate_Sequence(arr);
    }
    static void Generate_Sequence(int []arr)
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int size = i;size<arr.length;size++)
            {
                for(int j = i;j<=size;j++)
                {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
            
        }
    }
}
