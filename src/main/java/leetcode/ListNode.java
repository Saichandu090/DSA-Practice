package leetcode;

public class ListNode
{
    int val;
    ListNode next;
    ListNode()
    {

    }
    ListNode(int val)
    {
        this.val = val;
    }
    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}

class Solution
{
    ListNode sixth=new ListNode(6);
    ListNode fifth=new ListNode(5,sixth);
    ListNode fourth=new ListNode(4,fifth);
    ListNode third=new ListNode(3,fourth);
    ListNode second=new ListNode(2,third);
    ListNode head=new ListNode(1,second);

    public ListNode middleNode(ListNode head) // head =[1,2,3,4,5,6]
    {
        ListNode temp=head;
        ListNode middle=new ListNode();
        ListNode temp2=middle;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int mid=0;
        if(count%2==0)
           mid=count/2;
        else
            mid=count/2+1;
        temp=head;
        while(temp!=null)
        {
            count--;
            if(count+1==mid)
            {
                middle = temp;
                return middle;
            }
            temp=temp.next;
        }
        return middle;
    }

    public static void main(String[] args)
    {
        Solution s1=new Solution();
        ListNode middle=s1.middleNode(s1.head);
        ListNode middle2=s1.middle(s1.head);
        while(middle!=null)
        {
            System.out.println(middle.val);
            middle=middle.next;
        }

        System.out.println("==================");


        while(middle2!=null)
        {
            System.out.println(middle2.val);
            middle2=middle2.next;
        }

        System.out.println("=================");

//        ListNode modified=s1.delMiddle(s1.head);
//        while(modified!=null)
//        {
//            System.out.println(modified.val);
//            modified=modified.next;
//        }

        System.out.println("=================");

        ListNode modified2=s1.deleteMiddle(s1.head);
        while(modified2!=null)
        {
            System.out.println(modified2.val);
            modified2=modified2.next;
        }


    }

    public ListNode middle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.next;
    }

    public ListNode delMiddle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        ListNode modified=head;
        while(fast.next.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next.next=slow.next.next;
        modified.next=temp;
        return modified;
    }

    public ListNode deleteMiddle(ListNode head)
    {
        ListNode temp=head;
        ListNode middle=new ListNode();
        ListNode newNode=head;
        ListNode temp2=newNode;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int mid=0;
        if(count%2==0)
            mid=count/2;
        else
            mid=count/2+1;
        temp=head;
        while(temp.next!=null)
        {
            count--;
            if(count+1==mid)
            {
                middle = temp;
            }
            temp2=temp;
            temp=temp.next;
        }

        while(temp2!=null)
        {
            if(temp2.next.val==middle.val)
            {
                temp2.next=middle.next;
            }
            temp2=temp2.next;
        }
        return temp2;
    }
}
