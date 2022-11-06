package ARRAYS;
import java.util.ArrayList;
import java.util.List;
public class Subsets {
    /*
    Ques:: https://leetcode.com/problems/subsets/
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>list=new ArrayList <>();
        List<List <Integer>>finalList=new ArrayList<>();
        helper(list,finalList,nums,0);
        return finalList;
    }
    public void helper(List<Integer>list,List<List<Integer>>finalList,int[] arr,int index)
    {
        if(index>=arr.length){finalList.add(new ArrayList(list));}
        else
        {
            list.add(arr[index]);
            helper(list,finalList,arr,index+1);
            list.remove(list.size()-1);
            helper(list,finalList,arr,index+1);
        }
    }
}
