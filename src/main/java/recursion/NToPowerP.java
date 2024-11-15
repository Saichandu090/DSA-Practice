package recursion;

public class NToPowerP
{
    public static void main(String[] args)
    {
        int rs=pow(5,3);
        System.out.println(rs);
    }

    public static int pow(int n,int p)
    {
        if(n==0)
            return 0;
        if(p==0)
            return 1;
        return n*pow(n,p-1);
    }
}
