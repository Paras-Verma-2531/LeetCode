package POTD;
import java.util.Stack;
public class Remove_Adjacents_Duplicate_String {
    public String removeDuplicates(String s) {
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(st.isEmpty()||c!=st.peek())
                st.push(c);
            else
                st.pop();
        }
        String ans=new String("");
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}
