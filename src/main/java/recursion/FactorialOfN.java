package recursion;

public class FactorialOfN
{
    public static void main(String[] args)
    {
        int rs = getFact(5);
        System.out.println(rs);
    }

    public static int getFact(int n)
    {
        if(n==0 || n==1)
            return n;
        return n*getFact(n-1);
    }
}
