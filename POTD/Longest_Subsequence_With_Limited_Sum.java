package POTD;
import java.util.Arrays;
public class Longest_Subsequence_With_Limited_Sum {
    /*
    Ques: https://leetcode.com/problems/longest-subsequence-with-limited-sum/
     */
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int k = 0;
        int[] arr = new int[queries.length];
        for (int num : queries) {
            int sum = 0, count = 0;
            for (int j : nums) {
                sum += j;
                if (sum <= num) count++;
                else break;
            }
            arr[k++] = count;
        }return arr;
    }
}
