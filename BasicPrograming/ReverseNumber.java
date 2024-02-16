import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] arg)
    {
        // using string
        Scanner input = new Scanner(System.in);
        String ans="";
        System.out.println("Enter a number which you want to reverse");
        int number = input.nextInt();
        // while (number >0) {
        //     int rem = number%10;
        //     ans = ans + String.valueOf(rem);
        //     number = number/10;
        // }
        // System.out.print(ans);


        // without using string ---
        int result=0;
        while (number >0) {
            int rem = number %10;
            result = rem +(result*10);
            number = number/10;
        }
        System.out.println("Result:"+result);
    }
}
