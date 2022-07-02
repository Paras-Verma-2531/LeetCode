package STACK;
import java.util.Stack;
/*
Ques:: check if the given string contain valid parenthesis or not:
Approach:: if the brackets are open, push into stack
else: check if the stack is not empty,if empty returns false else: peek the top element and compare
and return as per the observation::
 */
public class Valid_Parenthesis {
    public boolean isValid(String st) {
        Stack<Character> stack=new Stack<>();
        char ch,pop;
        for(int i=0;i<st.length();i++)
        {
            ch=st.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
                stack.push(ch);
            else
            {
                if(!stack.isEmpty())
                {
                    pop=stack.peek();
                    if((ch==')'&&pop=='(')||(ch=='}'&&pop=='{')||(ch==']'&&pop=='['))
                        stack.pop();
                    else
                        return false;
                }else
                    return false;
            }
        }return stack.isEmpty();
    }
}
