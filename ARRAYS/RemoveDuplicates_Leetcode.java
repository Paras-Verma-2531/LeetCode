package ARRAYS;
import java.util.*;
public class RemoveDuplicates_Leetcode {
    /*
    Ques::Given an integer array nums of length n where all the integers of nums are in the range [1, n]
    and each integer appears once or twice, return an array of all the integers that appears twice.
     */
    public List<Integer> findDuplicates(int[] nums) {
        LinkedList<Integer> list=new LinkedList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            if(map.containsKey(i))
                list.add(i);
            else
                map.put(i,1);
        }
        Collections.sort(list);
        return list;
    }
}
