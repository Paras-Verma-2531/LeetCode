package RECURRSION;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Permutations {
    private static void helper(int[]nums, boolean[]arr, List <Integer> list) {
        if (list.size() == nums.length) {
            System.out.println(list);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!arr[i]) {// if and only if the element has not marked
                arr[i]=true;
                list.add(nums[i]);
                helper(nums, arr, list);
                list.remove(list.size() - 1);
                arr[i]=false;

            }
        }
    }
    public static void main(String[] args) {
       int[] nums={1,2,3};
       boolean[] arr=new boolean[nums.length];
        Arrays.fill(arr,false);
        helper(nums,arr,new ArrayList <Integer>());
    }
}

