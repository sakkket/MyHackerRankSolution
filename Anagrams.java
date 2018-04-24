import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagrams {

    static int anagram(String s){
        int count =0;
        if(s.length()%2!=0)
            return -1;
        else
        {
            
            String s1 = s.substring(0,s.length()/2);
            String s2 = s.substring(s.length()/2);
            char[] char1 = s1.toCharArray();
            char[] char2 = s2.toCharArray();
          
            for(int i=0;i<s.length()/2;i++)
            {
               for(int j=0;j<s.length()/2;j++)
                   if(char1[i]==char2[j])
                   {
                       char1[i] = '1';
                       char2[j] = '1';
                       
                   }
                    
            }
            for(int i=0;i<s.length()/2;i++)
                if(char1[i]!='1')
                    count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
