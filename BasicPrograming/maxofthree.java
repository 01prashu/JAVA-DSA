import java.util.Scanner;

public class maxofthree{
    public static void main(String []arg)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // int max = a;
        // if(b>max)max = b;
        // if(c>max)max = c;
        int max_ans = Math.max(a , Math.max(b , c));
        System.out.println("Maximum is:"+max_ans);
    }
}