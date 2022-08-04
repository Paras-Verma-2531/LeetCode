package ARRAYS;
public class ShuffleString {
    /*
    Ques: You are given a string s and an integer array indices of the same length.
    The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string
     */
    public String restoreString(String s, int[] indices) {
        /*
        ::::MYAPPROACH::::
        StringBuilder st=new StringBuilder(s);
        for(int i=0;i<s.length();i++)
            st.replace(indices[i],indices[i]+1,Character.toString(s.charAt(i)));
        return st.toString();
        */
        char[] newarr=new char[indices.length];int i=0;
        while(i<s.length())
            newarr[indices[i]]=s.charAt(i++);
        return String.valueOf(newarr);
    }
}
