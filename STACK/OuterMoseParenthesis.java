package STACK;
public class OuterMoseParenthesis {
    //Ques: remove outermost parenthesis
    public String removeOuterParentheses(String s) {
        StringBuilder st=new StringBuilder();int count=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='('&&count++>0)st.append(ch);
            if(ch==')'&&count-->1)st.append(ch);
        }return st.toString();

    }
}
