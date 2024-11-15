package recursion;

public class SumOfN
{
    public static void main(String[] args)
    {
        int rs=sumOfN(10);
        System.out.println(rs);
    }

    public static int sumOfN(int n)
    {
        if(n==1)
            return 1;
        return n+sumOfN(n-1);
    }
}
