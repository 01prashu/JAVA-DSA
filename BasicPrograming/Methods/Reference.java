import java.util.Scanner;
public class Reference{
    public static void main(String [] arg)
    {
        int a= 5 , b = 6;
        fun(a , b);
        
        System.out.print(a+" "+b);
    }
    static void fun(int a  , int b)
    {
        ++a;
        ++b;
    }
}