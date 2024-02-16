import java.util.Scanner;
public class CountOccuranceOfDigit{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("Enter integer to find the count");
        int digit =input.nextInt();
        int c = 0;
        while(number >0)
        {
            int rem =number%10;
            if(rem == digit)c++;
            number = number/10;
        }
        System.out.println(digit +" occured: "+c+" times");
    }
}