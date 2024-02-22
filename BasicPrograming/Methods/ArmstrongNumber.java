import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println(CheckArmstrom(num));
    }
    static boolean CheckArmstrom(int num)
    {
        int res = num;
        int sum = 0;
        while (num >0) {
            int rem = num%10;
            sum = sum +(rem*rem*rem);
            num = num/10;
        }
        if(sum == res)return true;
        return false;
    }
}