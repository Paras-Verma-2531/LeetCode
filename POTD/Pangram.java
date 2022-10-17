package POTD;
public class Pangram {
    /*
    Ques: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
     */
    public boolean checkIfPangram(String sentence) {
        boolean[] letters=new boolean[26];// make a boolean array for 26 alphabets
        for(char ch:sentence.toCharArray())
            letters[ch-'a']=true;//mark each index as true if present
        for(boolean bl:letters)
            if(!bl)return false;//return false if at any index is marked as false
        return true;
    }
}
