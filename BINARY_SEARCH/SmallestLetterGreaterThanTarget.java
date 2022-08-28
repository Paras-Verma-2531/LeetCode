package BINARY_SEARCH;
public class SmallestLetterGreaterThanTarget {
    /*
    Ques:Given a characters array letters that is sorted in non-decreasing order and a character target,
    return the smallest character in the array that is larger than target.
Note that the letters wrap around.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a
     */
    //Approach : Binary Search ---> TC 0(Logn)
    public char nextGreatestLetter(char[] arr, char target) {
        int start=0,end=arr.length-1;
        if(arr[end]<=target)return arr[start];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            //if(arr[mid]==target)return arr[mid];
            if(arr[mid]>target)end=mid-1;
            else
                start=mid+1;
        }return start<arr.length?arr[start]:arr[start-1];
    }
}
