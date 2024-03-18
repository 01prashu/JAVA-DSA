import java.util.*;
public class FindMissingElement {
    public static void main(String[]arg)
    {
        Scanner input= new Scanner(System.in);
        int []arr={1 , 2, 4 , 5 , 6 ,7 ,8};
        int elements = arr.length+1;
        int sum = 0 ,  result = 0 ;
        // sum = GetSum(elements);
        sum = (elements*(elements+1))/2;
        result = GetResult(arr , sum ,0);
        System.out.println(result);
    }
    static int GetResult(int[]arr , int sum , int i)
    {
        if(i == arr.length)return sum;
        sum = sum -arr[i];
        return GetResult(arr , sum , ++i);
    }
    static int GetSum(int element  )
    {
        if(element==0)return 0;
        return element + GetSum(element-1);
    }
}
