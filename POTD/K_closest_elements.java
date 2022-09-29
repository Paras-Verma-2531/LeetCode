package POTD;
import java.util.ArrayList;
import java.util.List;
public class K_closest_elements {
    /*
    Ques: https://leetcode.com/problems/find-k-closest-elements/
     */
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer>list=new ArrayList<>();
        int start=0,end=arr.length-1;
        while(end-start>=k)// for k elements to exists
        {
            //A no is closest if a[i]-x < a[j]-x or (== when i<j)
            if(Math.abs(arr[start]-x)>Math.abs(arr[end]-x))start++;// if a[i]-x > a[j]-x make i++ [we want smaller sorted numbers]
            else
                end--;
        }
        while(start<=end)
            list.add(arr[start++]);
        return list;
    }
}
