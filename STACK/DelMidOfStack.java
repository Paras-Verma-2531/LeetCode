package STACK;
import java.util.Stack;
public class DelMidOfStack {
    /*
    https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/
     */
    //brute force Approach : O(n) 0(n)
    //Function to delete middle element of a stack.
    public void deleteMid(Stack <Integer> s, int size){
        // code here
        int midPos=(int)(Math.ceil(size+1)/2.0);
        int[]arr=new int[size];int k=size-1;
        while(!s.isEmpty())
        {
            arr[k--]=s.pop();

        }
        for(int i=0;i<size;i++)
        {
            if(i==midPos-1)continue;
            s.push(arr[i]);
        }
    }
}
