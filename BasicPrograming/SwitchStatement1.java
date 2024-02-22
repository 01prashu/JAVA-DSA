import java.util.*;
public class SwitchStatement1 {
    public static void main(String[] arg)
    {
        int a = (int)(Math.random()*3)+1;
        switch (a) {
            case 1:
                System.out.println("Displaying 1");
                break;
            case 2:
                System.out.println("Displaying 2"); 
                break;
            case 3:
                System.out.println("Displaying 3");
                break;
            default:
                System.out.println("Enter valid case");
                break;
        }
    }
}
