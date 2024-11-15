package leetcode;

public class ArraysExamples
{
    public static void main(String[] args)
    {
        int[] ar={1,2,3,4,5,6,7,8,9};
        int rs=getMid(ar);
        System.out.println(rs);
    }

    public static int getMid(int[] ar)
    {
        int slow=0,fast=0,i=0;
        while(fast<ar.length)
        {
            slow=i++;
            fast=slow+i;
        }
        return ar[slow];
    }
}
