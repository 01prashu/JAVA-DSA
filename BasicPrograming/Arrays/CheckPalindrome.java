import java.util.*;
public class CheckPalindrome {
    public static void main(String[]arg)
    {
        String s = "acffa";
        System.out.println(CheckPalindrome(s,0 , s.length()-1));
        
    }
    static Boolean CheckPalindrome(String s  ,int start , int end )
    {
        if(start >= end)return true;
        if(s.charAt(start) != s.charAt(end))return false;
        return CheckPalindrome(s, ++start, --end);
    }
}
