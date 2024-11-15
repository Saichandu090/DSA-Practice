package recursion;

public class CountDigitsInANumber
{
    public static void main(String[] args)
    {
        int rs=countDigits(12345);
        System.out.println(rs);
    }

    public static int countDigits(int n)
    {
        if(n>=-9 && n<=9)
            return 1;
        return 1+countDigits(n/10);
    }
}
