package recursion;

public class PrintingNumbers
{
    public static void main(String[] args)
    {
        print1ToN(10);
        System.out.println("==============");
        printNTo1(10);
    }

    public static void print1ToN(int n)
    {
        print1ToN(n,1);
    }

    public static void print1ToN(int n,int s)
    {
        if(s-1==n)
            return;
        System.out.println(s);
        print1ToN(n,s+1);
    }

    public static void printNTo1(int n)
    {
        printNTo1(n,1);
    }

    public static void printNTo1(int n,int s)
    {
        if(s!=n)
            printNTo1(n,s+1);
        System.out.println(s);
    }
}
