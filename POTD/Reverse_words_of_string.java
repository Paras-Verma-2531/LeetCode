package POTD;
public class Reverse_words_of_string {
    /*
    Ques: https://leetcode.com/problems/reverse-words-in-a-string/
     */
    public String reverseWords(String s) {
        String st="";
        int i=s.length()-1,j=0;
        while(i>=0)
        {
            while(i>=0&&s.charAt(i)==' ')i--;
            j=i;
            if(i<0)break;
            while(i>=0&&s.charAt(i)!=' ')i--;
            if(st.isEmpty())
                st+=(s.substring(i+1,j+1));
            else
                st+=(' '+s.substring(i+1,j+1));
        }return st;
    }
}
