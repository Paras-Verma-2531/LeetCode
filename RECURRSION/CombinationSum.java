package RECURRSION;
import java.util.ArrayList;
import java.util.List;
public class CombinationSum {
    /*
    Ques: https://leetcode.com/problems/combination-sum/
     */
    private void helper(int[]arr, int index, int target, List<List <Integer>>finalAns, List<Integer>currAns)
    {
        //base condition when we have reached to the end of the array
        if(index==arr.length)
        {
            //if target==0 :: make new list with elements of currAns and add it into finalAns
            if(target==0)finalAns.add(new ArrayList <>(currAns));
            return;
        }
        // take the same element only if the arr[index]<=target
        if(arr[index]<=target)
        {
            currAns.add(arr[index]);//add the element into list
            //since we have included the element repeated time:: make target as target-arr[index]  and pass the same index
            helper(arr,index,target-arr[index],finalAns,currAns);
            //At the end remove the data as well from the list::
            currAns.remove(currAns.size()-1);
        }
        helper(arr,index+1,target,finalAns,currAns);
    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>>finalAns=new ArrayList<>();
        helper(arr,0,target,finalAns,new ArrayList<Integer>());
        return finalAns;

    }
}
