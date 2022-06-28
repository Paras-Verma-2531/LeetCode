public class Merge_Sorted_Array {
    // merge two sorted Array where length of first array is "1+2"array
    // m is original length of first array
    /*
    Approach:: Since the arrays are sorted therefore place the pointers at the last index and start
    the comparison and place it accordingly
    p1: size of first array -1;
    p2:size of 2nd array -1;
    k=last index of array 1[empty place]
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, k = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[k] = nums1[p1];
                k--;
                p1--;
            } else {
                nums1[k] = nums2[p2];
                k--;
                p2--;
            }
        }

    }
}

