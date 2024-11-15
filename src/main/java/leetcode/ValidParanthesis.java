package leetcode;

import java.util.Stack;

public class ValidParanthesis
{
    public static void main(String[] args)
    {
        boolean rs=isValid("{(})");
        System.out.println(rs);
    }

    public static boolean isValid(String s)
    {
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='(')
            {
                stk.push(ch);
            }
            else
            {
                if(stk.isEmpty())
                    return false;
                switch (ch)
                {
                    case ']' : char c=stk.pop();
                               if(c!='[')
                                   return false;
                               break;
                    case '}' : char d=stk.pop();
                               if(d!='{')
                                   return false;
                                break;
                    case ')' : char e=stk.pop();
                               if(e!='(')
                                   return false;
                                break;
                }
            }
        }
        return stk.isEmpty();
    }
}
