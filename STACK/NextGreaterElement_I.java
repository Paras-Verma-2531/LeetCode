package STACK;
import java.util.Stack;
public class NextGreaterElement_I {
    /*
    Ques : array 1 is a subset of array 2: find the next greater element of array 1 and modify the array 1:
    eg:
    Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
    Output: [-1,3,-1]
    Approach : Brute force[O(N^2)]
    since the greater element will be to the right of element in array 2, therefore till i!=j push the elements in stack
    now once the element are pushed, check if the stack is not empty and peek is <=nums[i],and pop the data
    now check;  nums1[i]=stack.isEmpty()?-1:stack.peek();
    and make the stack clear::
    */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<nums1.length;i++)
        {
            int j=nums2.length-1;
            while(nums1[i]!=nums2[j])
            {
                stack.push(nums2[j]);
                j--;
            }
            while(!stack.isEmpty()&&stack.peek()<=nums1[i])
                stack.pop();
            nums1[i]=stack.isEmpty()?-1:stack.peek();
            stack.clear();
        }return nums1;
    }
    /*
    2nd Approach :
    ============================================
    traverse for the 2nd array since array 1 is the subset of 2nd.
    And proceeds the same as done for next greater element
    [instead of inserting them in array , put them in map]
    ============
    traverse for 1st array
    and put the values of i in new array
    and return the same.
    once done:

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map=new HashMap<>();
        Stack<Integer>stack=new Stack<>();
        int[] newarr=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&stack.peek()<=nums2[i])
                stack.pop();
            map.put(nums2[i],stack.isEmpty()?-1:stack.peek());
            //newarr[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(nums2[i]);
        }int j=0;
       for(int i: nums1)
       {
           newarr[j++]=map.get(i);
       }return newarr;
    }
     */
}
