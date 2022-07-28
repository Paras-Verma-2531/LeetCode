package ARRAYS;
import java.util.ArrayList;
public class SubArraySum {
    /*
    Ques:: Given an unsorted array A of size N that contains only non-negative integers,
    find a continuous sub-array which adds to a given number S
     */
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list=new ArrayList<>();int sum=0,low=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            while(sum>s&&low<i)
                sum-=arr[low++];
            if(sum==s)
            {
                list.add(low+1);
                list.add(i+1);
                break;
            }
        }if(list.size()==0)
        list.add(-1);
        return list;
    }
}
