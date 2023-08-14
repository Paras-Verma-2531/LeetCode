package HASHMAP;
import java.util.*;
public class SubArray_with_xor_k {
    /*
    https://www.interviewbit.com/problems/subarray-with-given-xor/
     */
    //Optimal Approach
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int n=a.length;
        int count=0;
        int xor=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            xor^=a[i];
            if(map.containsKey(b^xor))count+=map.get(b^xor);
            map.put(xor,map.getOrDefault(xor,0)+1);
        }return count;
    }
}
