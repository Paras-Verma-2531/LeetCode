package ARRAYS;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class MajorityElement {
    /*
    Ques::Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
    ---------------------------------------------------
    ---------------------------------------------------
    public int majorityElement(int[] nums) {
        // [[[[[[[  ***** MY APPROACH******]]]]]]
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);//add the arr[i] and it's frequency into the map
        }
        Iterator<Integer> it=map.keySet().iterator();
        while(it.hasNext())
        {
            int val=it.next();//traverse through the map and search for the max key.value
            if(map.get(val)>(nums.length/2))return val;
        }return 0;
    }
    */
    // Optimized solution: Time Comp: O(n),,Space comp: O(1)
    //[["MOORE'S VOTING ALGO"]]
    /*
    The index i,e ind will give the majority element
    we assume the first element is the majority element
    make its count as 1 and ind as 0:
    now traverse through the array and if arr[i] == arr[ind] make count++
    else make count --;
    if(count==0) change count to 1 and ind to i
    --------------
    // traverse the loop again and check if count of arr[ind] is >n/2::
    if yes, return the element
     */
    public int majorityElement(int[] nums) {
        int ansInd=0;
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[ansInd])
                count++;
            else
                count--;
            if(count==0)
            {
                ansInd=i;count=1;
            }
        }count=0;
        for(int i=0;i<nums.length;i++)
            if(nums[ansInd]==nums[i])
                count++;
        if(count>(nums.length/2))return nums[ansInd];
        return 0;
    }

}

