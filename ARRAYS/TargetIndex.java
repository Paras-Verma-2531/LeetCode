package ARRAYS;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/*
Ques: find the index of the target and return the list
Approach : Sort the array,run the loop till length and if arr[i]==target add the index to the list
return list;
 */
public class TargetIndex {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ls = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                ls.add(i);
        }return ls;
    }
}


