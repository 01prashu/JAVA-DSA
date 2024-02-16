import java.util.Scanner;
public class Calculator{
    public static void main(String[] arg)
    {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number for operation");
        System.out.println("1)Addition");
        System.out.println("2)Subtraction");
        System.out.println("3)Multiplication");
        System.out.println("4)Division");
        System.out.println("5)Remainder");
        System.out.println("Do you want to perform operation (y/n)?");
        char s =input.next().charAt(0);
        while(true)
        {
            if(s=='y'||s=='Y')
            {
                System.out.println("Enter the operation number");
                int operation =input.nextInt();
                System.out.println("Enter the num1");
                int num1 = input.nextInt();
                System.out.println("Enter the num2");
                int num2 = input.nextInt();
                if(operation == 1)
                {
                    System.out.println("Addition is:"+(num1+num2));
                }
                else if(operation == 2)
                {
                    System.out.println("Subtraction is:"+(num1-num2));
                }
                else if(operation == 3)
                {
                    System.out.println("Multiplication is:"+(num1*num2));
                }
                else if(operation == 4)
                {
                    System.out.println("Division is:"+(num1/num2));
                }
                else if(operation == 5)
                {
                    System.out.println("Remainder is:"+(num1 % num2));
                }
                else{
                    System.out.println("Please Enter valid operation number");
                }
                System.out.println("Do you want to perform operation (y/n)?");
                s = input.next().charAt(0);
            }
            break;
        }
        System.out.println("You are existed!");
    }
}