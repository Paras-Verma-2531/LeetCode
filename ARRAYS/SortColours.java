package ARRAYS;
public class SortColours {
    /*
    Ques:::  Given an array nums with n objects colored red, white, or blue, sort them in-place
 so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     */
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0;
        for(int i:nums)
        {
            if(i==0)
                zero++;
            else if(i==1)
                one++;
            else
                two++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i<zero)nums[i]=0;
            else if(i<zero+one)nums[i]=1;
            else
                nums[i]=2;
        }
    }
}
