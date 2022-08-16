package STRINGS;
public class isSubsequence {
    /*
    Ques:: Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters
 without disturbing the relative positions of the remaining characters.
 (i.e., "ace" is a subsequence of "abcde" while "aec" is not
     */
    public boolean isSubsequence(String s, String t) {
        int indexS=0,indexT=0;
        if(s.length()==0)return true;// if s is empty return true;
        while(indexT<t.length())// run till the length of String "T"
        {
            if(s.charAt(indexS)==t.charAt(indexT))//if s[indexS]==t[indexT] make index++
            {
                indexS++;
                if(indexS==s.length())return true;//if indexS reaches end of String S --> subsequence is present[return true]
            }indexT++;
        }return false;
    }
}
