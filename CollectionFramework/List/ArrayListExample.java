// import java.util.Scanner;
import java.util.*;
public class ArrayListExample{
    public static void main(String[]arg)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        System.out.println(nums);
        nums.add(20 );
        System.out.println(nums.get(1));
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        System.out.println(nums.size());
    }
}