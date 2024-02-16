import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloJavaCammandLine {
    public static void main(String [] arg)
    {
        JFrame frame = new JFrame("Hello Java!");
        JLabel jLabel = new JLabel("Hello Java!" ,JLabel.CENTER);
        frame.add(jLabel);
        frame.setSize(300 ,300);
        frame.setVisible(true);
    }
}
