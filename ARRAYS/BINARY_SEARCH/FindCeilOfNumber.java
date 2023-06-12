package ARRAYS.BINARY_SEARCH;
public class FindCeilOfNumber {
/*
if the array is sorted then it is the same ques as find insert index::
however if the array is not sorted :: use the following approach:
 */
    public static int findCeil(int[]arr,int target)
    {
        int min=1001;
        int q=min;
        int answer=-1;
        for(int i:arr)
        {
            if(i==target)return i;// if exact match is present
            if(i>target)
            {
                q=min;
                min=Math.min(i-target,min);//the closest ele. is one for which diff is minimum.
                if(min!=q)answer=i;// if min updated : we got our probable answer
            }
        }return answer;
    }
    public static void main(String[] args) {
        System.out.println(findCeil(new int[]{1,4,2,9,11,12,41,98},10) );
    }
}
