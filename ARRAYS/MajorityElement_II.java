package ARRAYS;

import java.util.*;

public class MajorityElement_II {
    /*
    https://leetcode.com/problems/majority-element-ii/
     */
    //better Approach using space :: hashing
    public List <Integer> majorityElement(int[]v) {
        Arrays.sort(v);
        LinkedList<Integer>list=new LinkedList <>();
        Map <Integer,Integer> map=new HashMap<>();
        for(int i:v)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Iterator <Integer> it=map.keySet().iterator();
        while(it.hasNext())
        {
            int key=it.next();
            if(map.get(key)>v.length/3)list.add(key);
        }return list;
    }
}
