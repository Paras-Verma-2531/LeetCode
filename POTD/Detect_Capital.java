package POTD;
public class Detect_Capital {
    /*
    Ques: https://leetcode.com/problems/detect-capital/
     */
    public boolean detectCapitalUse(String word) {
        if(word.length()==1)return true;
        if(Character.isUpperCase(word.charAt(0)))
        {
            boolean firstChar=Character.isUpperCase(word.charAt(1));
            for(int i=2;i<word.length();i++)
                if(firstChar!=Character.isUpperCase(word.charAt(i)))return false;
        }
        else
            for(int i=1;i<word.length();i++)
                if(Character.isUpperCase(word.charAt(i)))return false;
        return true;
    }
}
