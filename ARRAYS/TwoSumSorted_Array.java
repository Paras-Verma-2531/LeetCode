package ARRAYS;
import java.util.Arrays;
public class TwoSumSorted_Array {
    /*
    Ques::Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
    find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1]
    and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        Arrays.fill(arr,-1);
        int start=0,end=numbers.length-1;
        while(start<end)
        {
            if(numbers[start]+numbers[end]==target)
            {//if sum is equal to target:: set the index of arr and return
                arr[0]=start+1;arr[1]=end+1;return arr;
            }
            else if(numbers[start]+numbers[end]>target)end--;// if sum is > target make end as end -1
            else // if sum < target make start++
                start++;
        }return arr;
    }
}
