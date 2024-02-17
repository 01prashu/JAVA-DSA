
import java.util.Scanner;
public class CheckPrimenumber {
    public static void main(String []arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        System.out.println(CheckPrime(num));
    }
    static boolean CheckPrime(int num)
    {
        int i = 2;
        while(i<= num-1)
        {
            if(num %i ==0)return false;
            i++;
        }
        return true;
    }
}
