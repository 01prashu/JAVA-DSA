import java.util.Scanner;

public class InputData{
    public static void main(String [] arg)
    {


        // Scanner st = new Scanner(System.in);
        // System.out.println("Please enter int number");
        // int rollno = st.nextInt();
        // System.out.println("Your roll no is:"+rollno);
        // int a = 230_00_0_000;
        // System.out.println(a);

        // float marks = st.nextFloat();
        // System.out.println("Marks is:"+marks);

        // double score = st.nextDouble();
        // System.out.println("Score is:"+score);

        // String name=st.nextLine();
        // System.out.println("Your name is:"+name);

        // boolean check = st.nextBoolean();
        // System.out.println("Result of bool is:"+check);

        // int arr[]={1,2 , 3,4,4,4,4,4,67};
        // System.out.println(arr);



        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = "+sum);
        float mul = num1*num2;
        System.out.println("Multiplication is:"+mul);

        num1 = input.nextInt();
        

        System.out.println("Divide of (num1/num2):"+(num1/num2));
    }
}