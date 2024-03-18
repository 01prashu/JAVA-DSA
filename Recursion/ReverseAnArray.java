import java.util.*;

public class ReverseAnArray {
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        int [] arr ={1 , 2, 3 , 4, 5};
        arr = solve(arr , 0 , arr.length-1);

        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static int[] solve(int []arr , int s , int e)
    {
        if(s >= e)return arr;
        int t = arr[s];
        arr[s] =arr[e];
        arr[e] = t; 
        return solve(arr, ++s, --e);
    }
}
