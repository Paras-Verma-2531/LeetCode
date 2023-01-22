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
    //2ndcApproach :: no use of extra space i,e boolean array instead use swaping technique
    private static void swap(int[]arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static void helper(int[]nums,int index,List<Integer>list) {
        if (index == nums.length) {
            for(int j:nums)
                list.add(j);
            System.out.println(list);
            list.clear();
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            helper(nums, index + 1, list);
            swap(nums, index, i);
        }
    }
    public static void main(String[] args) {
       int[] nums={1,2,3};
       boolean[] arr=new boolean[nums.length];
        Arrays.fill(arr,false);
        helper(nums,0,new ArrayList <Integer>());
    }
}

