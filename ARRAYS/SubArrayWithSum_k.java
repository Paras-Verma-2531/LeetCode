package ARRAYS;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSum_k {
    /*
    Ques::Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
     */
    /*
    BruteForce:: Find all the subArray and check if it's cum is equal to K:: if yes:: make count++
    TC O(N^2) SC: O(1)

    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        { int sum=nums[i];
            if(sum==k)count++;
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum==k)count++;
            }
        }return count;
    }*/
    public int subarraySum(int[] nums, int k) {
        // TC : 0(N) SC: O(N) ---> prefix sum with the help of map
        int sum=0,count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i:nums)
        {
            sum+=i;
            if(map.containsKey(sum-k))//if subarray is formed by adding some 'x'
                count+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);// put into map with value 1 or +1 if already pres.
        }return count;
    }
}
