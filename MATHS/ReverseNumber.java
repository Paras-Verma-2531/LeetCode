package MATHS;
import java.util.*;
public class ReverseNumber {
    /*
    https://www.codingninjas.com/studio/problems/reverse-bits_2181102
     */
    private static void reverse(char[]ch)
    {
        int i=0,j=31;
        while(i<=j)
        {
            char c=ch[i];
            ch[i++]=ch[j];
            ch[j--]=c;
        }
    }
    public static long reverseBits(long n) {
        // Write your code here
        char[]arr=new char[32];
        Arrays.fill(arr,'0');
        String bin=Long.toBinaryString(n);
        for(int i=0;i<bin.length();i++)
        {
            arr[32-bin.length()+i]=bin.charAt(i);
        }
        reverse(arr);
        long ans=0;
        for(int i=0;i<32;i++)
        {
            if(arr[i]=='0')ans+=0*Math.pow(2, (31-i));
            else ans+=1*Math.pow(2, (31-i));
        }
        return ans;
    }
}
