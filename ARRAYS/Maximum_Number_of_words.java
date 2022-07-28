package ARRAYS;
public class Maximum_Number_of_words {
    /*
    Ques: A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.
     */
    public int stringLength(String str)
    { int k=0;char[] arr=str.toCharArray();
        for(char ch: arr)
            if(ch==' ')k++;
        return k+1;
    }
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++)
            max=Math.max(max,stringLength(sentences[i]));
        return max;
    }
}
