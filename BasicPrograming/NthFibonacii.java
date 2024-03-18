import java.util.*;
public class NthFibonacii {
    public static void main(String[]arg)
    {
        int n = 7;
        System.out.println(Get_Fibonacci(n));
    }
    static int Get_Fibonacci(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if(n == -1)
        {
            return -1;
        }
        else if(n ==1)
        {
            return 1;
        }
        return Get_Fibonacci(n-1)+Get_Fibonacci(n-2);
    }
}
