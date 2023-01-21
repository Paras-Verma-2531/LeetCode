package RECURRSION;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SubSet_II {
    /*
    Ques: https://leetcode.com/problems/subsets-ii/
     */
    private void helper(int[]arr,int index,List<List<Integer>>finalList,List<Integer>ans)
    {
        if(finalList.contains(ans))return;
        if(index==arr.length){finalList.add(new ArrayList<>(ans));return;}
        ans.add(arr[index]);
        helper(arr,index+1,finalList,ans);
        ans.remove(ans.size()-1);
        helper(arr,index+1,finalList,ans);
    }
    public List<List <Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>finalList=new ArrayList <>();
        Arrays.sort(nums);
        helper(nums,0,finalList,new ArrayList<Integer>());
        return finalList;
    }
}
