import java.util.Scanner;
public class Nthfibonacchinumber{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        int a = 0 , b = 1;
        int i = 2;
        int n = input.nextInt();
        while(i<=n)
        {
            
            int temp = b;
            b=b+a;
            a = temp;
            i++;
        }
        System.out.println(b);

    }
}