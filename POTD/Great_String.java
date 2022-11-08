package POTD;
public class Great_String {
    /*
    Ques: https://leetcode.com/problems/make-the-string-great/
     */
    public String makeGood(String s) {
        // Approach 1: using recursion
//        for(int i=0;i<s.length()-1;i++)
//        {
//            if(Math.abs((int)s.charAt(i)-(int)s.charAt(i+1))==32)
//                return makeGood(s.substring(0,i)+s.substring(i+2));
//        }return s;
        //2 pointer approach:
        StringBuilder sb = new StringBuilder();
        int pt2 = 0;
        for(int i = 0; i<s.length(); i++){
            if(pt2>0 && Math.abs(sb.charAt(pt2-1) - s.charAt(i)) == 32){
                pt2--;
                sb.deleteCharAt(pt2);
            }
            else{
                sb.append(s.charAt(i));
                pt2++;
            }
        }
        return sb.toString();
    }
}
