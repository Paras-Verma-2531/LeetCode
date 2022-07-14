package ARRAYS;
import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    /*
    Ques:: find the indices of sum present in an array
    Approach: O(N):
    if target-nums[i] is present in hashMap set the elements in arr
    put the nums([i],i) in hashMap
     */
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                arr[1]=i;
                arr[0]=map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }return arr;

    }
}
