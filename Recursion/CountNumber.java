import java.util.*;
public class CountNumber {
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nth number:");
        int n = input.nextInt();
        int i = 1;
        Count( i , n);
        // System.out.println(a);    
    }
    static void Count(int i ,int n)
    {
        // if(n == 0)
        // {
        //     return;
        // }
        // Count(n-1);
        // System.out.println(n);
        if(i>n)return;
        Count(i+1, n);
        System.out.println(i);

        
    }
}
