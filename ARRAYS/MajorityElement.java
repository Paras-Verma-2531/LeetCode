package ARRAYS;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class MajorityElement {
    /*
    Ques::Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
     */
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
}
}
