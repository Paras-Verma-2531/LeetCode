package HASHMAP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Distinct_Numbers_In_Window_Size_k {
   /*
   Ques::Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.
Example 1:
Input:
N = 7, K = 4
A[] = {1,2,1,3,4,2,3}
Output: 3 4 4 3
   ================================================================================
   bruteforce approach:: O(N^2)[in each subArray store the size of set for that array
   =================================================================================
   ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        Set<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<=n-k;i++)
        {
            for(int j=i;j<k+i;j++)
            {
                set.add(A[j]);
            }list.add(set.size());
            set.clear();
        }return list;
        ==========================================
        2nd Approach :: Using HashMap
    }
    */
   ArrayList<Integer> countDistinct(int[]A, int n, int k)
   {
       ArrayList<Integer>list=new ArrayList<>();
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<k;i++)// Add the initial subArray into the map
           map.put(A[i],map.getOrDefault(A[i],0)+1);// if present,increase its count by 1
       list.add(map.size());//add the size of first subArray into list
       for(int i=k;i<n;i++)// n-k loop
       {
           if(map.get(A[i-k])==1)// if the element of first index is present only once,discard it
               map.remove(A[i-k]);
           else
               map.put(A[i-k],map.get(A[i-k])-1);//else reduce its count by 1 [thus, provide illusion of sliding window]
           map.put(A[i],map.getOrDefault(A[i],0)+1);
           list.add(map.size());//Again add the size of subArray into list
       }return list;
   }
}
