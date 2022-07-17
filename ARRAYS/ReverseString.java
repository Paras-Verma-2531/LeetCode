package ARRAYS;
public class ReverseString {
    /*
    Ques: Write a function that reverses a string. The input string is given as an array of characters s.
          You must do this by modifying the input array in-place with O(1) extra memory
     */
    public void swap(char[]ch,int i,int j)
    {
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j)
            swap(s,i++,j--);

    }
}
