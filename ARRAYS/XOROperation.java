package ARRAYS;
public class XOROperation {
    /*
    Ques: You are given an integer n and an integer start.
Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.
Return the bitwise XOR of all elements of nums
     */
    public int xorOperation(int n, int start) {
        int[] arr=new int[n];
        int ans=start;
        for(int i=1;i<n;i++)
            ans^=(start+2*i);
        return ans;
    }
}
