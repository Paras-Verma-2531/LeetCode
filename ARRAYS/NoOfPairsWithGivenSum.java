package ARRAYS;
import java.util.HashMap;
import java.util.Map;
public class NoOfPairsWithGivenSum {
    /*
    Ques:: Given an array of N integers, and an integer K,
    find the number of pairs of elements in the array whose sum is equal to K
    Approach : add the no of times k-i is present in the hashMap:
    using map.get(k-i);
     */
    int getPairsCount(int[] arr, int n, int k) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i: arr)
        {
            if(map.containsKey(k-i))count+=map.get(k-i);
            map.put(i,map.getOrDefault(i,0)+1);
        }return count;
    }
}
