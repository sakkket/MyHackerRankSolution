import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedParentheses {
    static char stack[];
    static int top = -1;
    
    static void push(char data)
    {
        
        stack[++top]=data;
    }
    
    static char pop()
    {
        if(top<0)
            return '1';
        else
           return stack[top--];
    }

    static String isBalanced(String s) {
        //int length = s.length();
        stack = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            char temp = s.charAt(i);
            char pop ='0';
            if(temp =='(' || temp =='{' || temp =='[')
                push(temp);
            else if(temp ==')' || temp =='}' || temp ==']')
            {   pop = pop();
                 if(pop=='1')
                     return "NO";
             //    System.out.println(pop+"  "+temp);
               // System.out.prinltn("Top "")
                switch(temp)
                {
                    case ')' : if(pop=='(')
                                break;
                            else
                                return "NO";
                   
                    case '}' : if(pop=='{')
                                 break;
                            else
                                return "NO";
                    
                    case ']' : if(pop=='[')
                              break;
                           else
                               return "NO";
                   
                    
            }}
            
        }
       // System.out.println("Top "+top);
        if(top<0)
            return "YES";
        return "NO";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            top = -1;
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
