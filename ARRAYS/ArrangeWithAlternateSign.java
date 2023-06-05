package ARRAYS;
public class ArrangeWithAlternateSign {
    /*
     https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
     */
    //brute force approach : O(2N)--> store pos and neg in diff arrays   O(N)
    //optimal 0(n) O(n)
    public int[] rearrangeArray(int[] nums) {
        int[]arr=new int[nums.length];
        int pos=0,neg=1;// assign initial index for first + and first - no.
        for (int num : nums) {
            if (num >= 0) {
                arr[pos] = num;
                pos += 2;// increment by 2
            } else {
                arr[neg] = num;
                neg += 2;// increment by 2
            }
        }
        return arr;
    }
}
