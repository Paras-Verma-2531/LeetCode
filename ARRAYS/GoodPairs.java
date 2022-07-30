package ARRAYS;
import java.util.HashMap;
import java.util.Map;
public class GoodPairs {
    /*
    Ques:: Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Approach: O(N) :: use hashMap:
set the value of key as its occurence
and res as map.get(n)-1 [-1 to remove same indexed no.]
     */
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int res=0;
        for(int n: nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
            res+=map.get(n)-1;
        }return res;
    }
}
