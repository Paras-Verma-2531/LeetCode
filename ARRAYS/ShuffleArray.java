package ARRAYS;
public class ShuffleArray {
    /*
    Ques: Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     */
    public int[] shuffle(int[] nums, int n) {
        int[] newarr= new int[2*n];
        int k=0,j=n;
        for(int i=0;i<n;i++)
        {
            newarr[2*i]=nums[i];
            newarr[2*i+1]=nums[n+i];
        }
        return newarr;
    }
}
