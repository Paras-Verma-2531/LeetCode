package ARRAYS.BINARY_SEARCH;
import java.util.Arrays;
public class If_N_And_its_Double_Exists {
    /*
    Ques::Given an array arr of integers, check if there exists two integers N and M
    such that N is the double of M ( i.e. N = 2 * M).
More formally check if there exists two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
     */
    public boolean binarySearch(int[]arr,int start,int end,int target)
    { //normal recursive binary Search
        if(start>end)return false;
        int mid=start+(end-start)/2;
        if(arr[mid]==target)return true;
        if(arr[mid]>target)return binarySearch(arr,start,end-1,target);
        return binarySearch(arr,mid+1,end,target);
    }
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);// sort the array
        for(int i=0;i<arr.length;i++)
        { boolean val1=false,val2=false;
            if(arr[i]%2==0)// only check for even no's.
            {
                if(arr[i]>0)
                    //for +, it's half would be in range[0,1,---i-1]therefore set,end as i-1
                    val1= binarySearch(arr,0,i-1,arr[i]/2);
                else
                    //for -,it's half would be in range[i+1,i+2,---length-1]therefore set,start as i+1
                    val2= binarySearch(arr,i+1,arr.length-1,arr[i]/2);
            }if(val1||val2)return true;// if either of them is true return true:
        }
return false;
    }
}
