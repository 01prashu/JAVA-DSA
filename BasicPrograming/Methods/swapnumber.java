import java.util.Scanner;
public class swapnumber{
    public static void main(String[] arg)
    {
        swapfun(10 , 20);
    }
    static void swapfun(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}