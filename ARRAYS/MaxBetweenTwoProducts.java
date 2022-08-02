package ARRAYS;
import java.util.Arrays;
public class MaxBetweenTwoProducts {
    public int maxProduct(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        int ans=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        res=Math.max(res,ans);
        return res;
    }
}
