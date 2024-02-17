
import java.util.Scanner;
public class sumprog {
    public static void main(String [] arg)
    {
        int res1 = givesum(20, 45);
        int res2 = givesum(50, 70);
        System.out.println(res1+" " + res2);
    }
    static int givesum(int x, int y)
    {
        return (x+y);
    }
}
