package ARRAYS;
import java.util.*;
public class FindDuplicatesInUnSorted {
    /*
    Ques: Given an array a[] of size N which contains elements from 0 to N-1,
     you need to find all the elements occurring more than once in the given array.
     ===============================================================
     Approach : HashMap used to store elements and if it is already present add it into list
     then return the sorted list:: Tc-->o(NLOGN) SP->O(N)

    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i: arr)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        Iterator<Integer> it=map.keySet().iterator();
        while(it.hasNext())
        {
            int key=(int)it.next();
            if(map.get(key)>1)list.add(key);
        }
        if(list.size()==0)
            list.add(-1);
        Collections.sort(list);
        return list;
    }
    =======================================
    Optimized Approach:: Cyclic sort to find all duplicates
    */
    public void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void cyclicSort(int[]arr,int size)
    { int i=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<size)
        {
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i])swap(arr,i,correct);
            else
                i++;
        }
    }
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        cyclicSort(nums,nums.length);
        for(int i=0;i<nums.length;i++)
            if(nums[i]!=i+1)list.add(nums[i]);
        return list;

    }
}
