package RECURRSION;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SubSet_II {
    /*
    Ques: https://leetcode.com/problems/subsets-ii/
     */
    //bruteforce Approach:: if the list contains the same list do not add it otherwise add:
//    private void helper(int[]arr,int index,List<List<Integer>>finalList,List<Integer>ans)
//    {
//        if(finalList.contains(ans))return;
//        if(index==arr.length){finalList.add(new ArrayList<>(ans));return;}
//        ans.add(arr[index]);
//        helper(arr,index+1,finalList,ans);
//        ans.remove(ans.size()-1);
//        helper(arr,index+1,finalList,ans);
//    }
//    public List<List <Integer>> subsetsWithDup(int[] nums) {
//        List<List<Integer>>finalList=new ArrayList <>();
//        Arrays.sort(nums);
//        helper(nums,0,finalList,new ArrayList<Integer>());
//        return finalList;
//    }
    // Optimised Approach:
    private void helper(int[]arr,int index,List<List<Integer>>finalList,List<Integer>ans)
    {
        finalList.add(new ArrayList<>(ans));
        for(int i=index;i<arr.length;i++)
        {
            if(i!=index&&arr[i]==arr[i-1])continue;// if at each level we have same elements i,e == i-1 do not pick them
            ans.add(arr[i]);
            helper(arr,i+1,finalList,ans);
            ans.remove(ans.size()-1);

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>finalList=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,finalList,new ArrayList<Integer>());
        return finalList;
    }
}
