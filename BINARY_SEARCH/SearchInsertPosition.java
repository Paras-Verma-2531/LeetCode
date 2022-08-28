package BINARY_SEARCH;
public class SearchInsertPosition {
    /*
    Ques:Given a sorted array of distinct integers and a target value,
    return the index if the target is found. If not, return the index where it would be if it were inserted in order.
   You must write an algorithm with O(log n) runtime complexity.
     */
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1,idx=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target)end=mid-1;//will give first smaller number
            else
                start=mid+1;// will return the first greater number
        }return start;
    }
}
