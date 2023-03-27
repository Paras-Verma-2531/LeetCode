package ARRAYS;
public class NextGreaterPermutation {
    //https://leetcode.com/problems/next-permutation/submissions/922922471/
    /*
    Intution behind algo::
      try to find the break point that the ele from n-2 which is smaller than i+1;
      2. if no index found it means we already have the biggest permu. so return the reverse of array
      else :: swap from n-1 to ind :: iff arr[i]>arr[ind] break;
      3. reverse the array from ind+1 ---n-1:;
     */
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int ind = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            reverse(nums, 0, nums.length - 1);
        } else {
            for (int i = nums.length - 1; i > ind; i--) {
                if (nums[i] > nums[ind]) {
                    swap(nums, i, ind);
                    break;
                }
            }
            reverse(nums, ind + 1, nums.length - 1);
        }
    }
}
