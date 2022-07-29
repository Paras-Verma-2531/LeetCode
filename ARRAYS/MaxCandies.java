package ARRAYS;

import java.util.LinkedList;
import java.util.List;
public class MaxCandies {
    /*
    Ques:There are n kids with candies. You are given an integer array candies,
    where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies,
    denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
     */
    public int maxVal(int[] arr)
    {
        int max=arr[0];
        for(int i:arr)
            max=Math.max(max,i);
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        LinkedList<Boolean>list=new LinkedList<>();
        int max=maxVal(candies);
        for(int i: candies)
            list.add(i+extraCandies>=max);
        return list;
    }
}
