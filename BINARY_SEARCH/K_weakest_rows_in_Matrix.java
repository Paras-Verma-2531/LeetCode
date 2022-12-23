package BINARY_SEARCH;
public class K_weakest_rows_in_Matrix {
    /*
    Ques: You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).
    The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
A row i is weaker than a row j if one of the following is true:
The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
     */
    public int binarySearch(int[]arr,int start,int end)
    {
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==0)end=mid;
            else
                start=mid+1;
        }return start;// will return the first index of zero [which will be equal to no if zero's]
    }
    public void sorting(int[]arr,int[]idxarr,int size)
    {// normal bubble Sorting
        for(int i=0;i<size;i++)
        {for(int j=0;j<size-i;j++)
            {if(arr[j]>arr[j+1])
                {int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    //swap index
                    int pos=idxarr[j];
                    idxarr[j]=idxarr[j+1];
                    idxarr[j+1]=pos;
                }}}}
    public int[] kWeakestRows(int[][] mat, int k) {
        int[]arr=new int[mat.length];// stores the  no of soldiers
        int []idxarr=new int[mat.length];// stores the index
        for(int i=0;i<mat.length;i++)
            arr[i]=binarySearch(mat[i],0,mat[i].length);
        int j=0;
        while(j<idxarr.length)
            idxarr[j]=j++;
        sorting(arr,idxarr,arr.length-1);// sorting for index and soldiers
        int[] newarr=new int[k];
        // k weakest soldiers
        System.arraycopy(idxarr, 0, newarr, 0, k);
       
 return newarr;
    }
}
