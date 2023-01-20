package RECURRSION;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
public class FindSubsequences {
    /*
    Ques: https://leetcode.com/problems/non-decreasing-subsequences/description/
     */
    private void helper(int[] arr,int index,Set<List<Integer>>finalList,List<Integer>ans)
    {
        if(ans.size()>=2)finalList.add(new ArrayList<>(ans));
        for(int i=index;i<arr.length;i++)
        {
            if(ans.size()==0||arr[i]>=ans.get(ans.size()-1))
            {
                ans.add(arr[i]);
                helper(arr,i+1,finalList,ans);
                ans.remove(ans.size()-1);
                //helper(arr,i+1,finalList,ans);
            }
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>>finalAns=new HashSet <>();
        helper(nums,0,finalAns,new ArrayList<Integer>());
        List<List<Integer>>finalList=new ArrayList(finalAns);
        return finalList;

    }
}
