package recursion;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        int rs=sumOfDigits(981);
        System.out.println(rs);
    }

    public static int sumOfDigits(int n)
    {
        if(n>=-9 && n<=9)
            return n;
        return n%10+sumOfDigits(n/10);
    }
}
