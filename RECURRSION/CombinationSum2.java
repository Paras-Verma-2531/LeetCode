package RECURRSION;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
public class CombinationSum2 {
    //Approach 1:: same as combination Sum 1:: just instead of List use Set for unique elements::
    // however it gives TLE
    /*
    private void helper(int[]arr, int index, int target, Set<List<Integer>>finalAns, List <Integer> currAns)
    {
        if(arr.length==index)
        {
            if(target==0)finalAns.add(new ArrayList<>(currAns));
            return;
        }
        currAns.add(arr[index]);
        helper(arr,index+1,target-arr[index],finalAns,currAns);
        currAns.remove(currAns.size()-1);
        helper(arr,index+1,target,finalAns,currAns);

    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Set<List<Integer>>finalAns=new HashSet<>();
        Arrays.sort(arr);
        helper(arr,0,target,finalAns,new ArrayList<Integer>());
        List<List<Integer>>finalList=new ArrayList<>(finalAns);
        return finalList;
    }
    Approach 2:: since we need to remove duplicates therefore, better to go with loops and use sorted Array
     */
    private void helper(int[]arr,int index,int target,List<List<Integer>>finalAns,List<Integer>currAns)
    {
        if(target==0)
        {
            finalAns.add(new ArrayList<>(currAns));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(i>index&&arr[i]==arr[i-1])continue;//if i is the first index or starting point we need to include no matter it is the same as its previous
            if(arr[i]>target)break;
            currAns.add(arr[i]);
            helper(arr,i+1,target-arr[i],finalAns,currAns);
            currAns.remove(currAns.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>>finalAns=new ArrayList<>();
        Arrays.sort(arr);
        helper(arr,0,target,finalAns,new ArrayList<Integer>());
        return finalAns;
    }
}
