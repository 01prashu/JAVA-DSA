import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        switch (s) {
            case "apple":
                System.out.println("Apple is sweet");
                break;
            case "mango":
                System.out.println("Mango is king of fruit");
                break;
            case "chiku":
                System.out.println("Chiku is one of the favourite");
                break;
            default:
                System.out.println("Please enter valid fruit name");    
                
        }
    }
}
