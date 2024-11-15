package recursion;

public class PalindromeString
{
    public static void main(String[] args)
    {
        boolean rs=isPalindrome("malayalam");
        if(rs)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static boolean isPalindrome(String st)
    {
        return isPalindrome(st,0,st.length()-1);
    }

    public static boolean isPalindrome(String st,int start,int end)
    {
        if(end>start)
            return true;
        if(st.charAt(start)!=st.charAt(end))
            return false;
        return isPalindrome(st,start+1,end-1);
    }
}
