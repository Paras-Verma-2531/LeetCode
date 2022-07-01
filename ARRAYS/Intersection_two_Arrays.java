import java.util.HashSet;
import java.util.Set;
public class Intersection_two_Arrays {
    /*
    Ques:: Intersection of two Arrays:
    return an array which contains intersection of 2 arrays:
    Approach:: can be solved using HashSet
    ---------------------
    Add the first array in Set. if the element of second array is present in first set add it to second set and remove the element from the first set:
    done: to prevent multiple increment
    */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1)
            set1.add(i);
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
                set1.remove(i);// prevent multiple increment
            }
        }
        int[] arr = new int[set2.size()];
        int j = 0;
        for (int i : set2)// add the intersection elements to another array
            arr[j++] = i;
        return arr;
    }
}

