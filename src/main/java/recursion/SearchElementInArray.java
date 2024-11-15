package recursion;

public class SearchElementInArray
{
    public static void main(String[] args)
    {
        int[] ar={1,2,3,4,5,6,7,8,9};
        int rs=isPresent(ar,7);
        if(rs!=-1)
            System.out.println(7+" is present at "+rs);
        else
            System.out.println("Not Present");
    }

    public static int isPresent(int[] ar,int ele)
    {
        return isPresent(ar,ele,0);
    }

    public static int isPresent(int[] ar,int ele,int i)
    {
        if(i>ar.length)
            return -1;
        if(ar[i]==ele)
            return i;
        return isPresent(ar,ele,i+1);
    }
}
