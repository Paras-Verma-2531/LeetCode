package ARRAYS;
import java.util.ArrayList;
public class TargetArrayInGivenOrder {
    /*
    Ques:: Given two arrays of integers nums and index. Your task is to create target array under the following rules:
Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid
     */
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<index.length;i++)
        {
            list.add(index[i],nums[i]);// add the element of nums[i] at index[i]
        }int k=0;
        for(int i: list)
            target[k]=list.get(k++);// insert the data into array
        return target;
    }
}
