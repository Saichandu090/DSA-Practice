package recursion;

public class ReverseOfN
{
    public static void main(String[] args)
    {
        int rs=getRev(12345);
        System.out.println(rs);
    }

    public static int getRev(int n)
    {
        return getRev(n,0);
    }

    public static int getRev(int n,int rev)
    {
        if(n==0)
            return rev;
        return getRev(n/10,rev*10+n%10);
    }
}
