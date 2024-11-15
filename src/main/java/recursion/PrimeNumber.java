package recursion;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        boolean rs=isPrime(67);
        if(rs)
            System.out.println("Prime");
        else
            System.out.println("Not a Prime");
    }

    public static boolean isPrime(int n)
    {
        return isPrime(n,2);
    }

    public static boolean isPrime(int n,int i)
    {
        if(n==0 || n==1)
            return false;
        if(i>n/2)
            return true;
        if(n%i==0)
            return false;
        return isPrime(n,i+1);
    }
}
