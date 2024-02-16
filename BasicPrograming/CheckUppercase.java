import java.util.Scanner;
public class CheckUppercase{
    public static void main(String [] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        
       char ch = input.next().trim().charAt(0);
       if(ch >='a' && ch <='z')System.out.println("lowercase letter");
       else System.out.println("Uppercase letter");
    }
}