package ARRAYS;
import java.util.Arrays;
/*
Ques:: Check if N and its double exists in the array or not:
Approach : Binary search::
[Note]: i!=j
in checkIfExists function: pass the 2*arr[i] as the target and 0,arr.length-1 as lb,ub;
 */
public class If_N_and_its_Double_exists {
    public boolean binarySearch(int[] arr, int target, int lb, int ub, int i) {
        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (arr[mid] == target) {
                return mid != i;// must be the different positions
            }
            if (arr[mid] < target)
                lb = mid + 1;
            if (arr[mid] > target)
                ub = mid - 1;
        }
        return false;
    }
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (binarySearch(arr, 2 * arr[i], 0, arr.length - 1, i))
                return true;
        }
        return false;
    }
}

