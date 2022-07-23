package ARRAYS;
import java.util.*;
public class FindDuplicatesInUnSorted {
    /*
    Ques: Given an array a[] of size N which contains elements from 0 to N-1,
     you need to find all the elements occurring more than once in the given array.
     */
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
}
