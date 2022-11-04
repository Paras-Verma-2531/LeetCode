package POTD;
public class ReverseVowels {
    /*
    Ques::https://leetcode.com/problems/reverse-vowels-of-a-string/
     */
    public String reverseVowels(String s) {
        char[] chr=s.toCharArray();
        int start=0,end=chr.length-1;
        while(start<end)
        {
            while(start<end&&!isVowel(chr[start]))start++;
            while(start<end&&!isVowel(chr[end]))end--;
            if(start<end)
            {
                char ch=chr[start];
                chr[start++]=chr[end];
                chr[end--]=ch;
            }
        }return new String(chr);
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
