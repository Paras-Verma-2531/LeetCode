package ARRAYS.BINARY_SEARCH;
public class MedianOf2SortedArrays {
    //brute force approach::
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
        int []newArr=new int[n+m];
        int i=0,j=0;
        int k=0;
        while(i<n&&j<m)
        {
            if(a[i]<=b[j])newArr[k++]=a[i++];
            else newArr[k++]=b[j++];
        }
        if(i<n)
        {
            while(i<n)
            {
                newArr[k++]=a[i++];
            }
        }
        else{
            while(j<m)
            {
                newArr[k++]=b[j++];
            }
        }
        if(newArr.length%2==0)
        {
            return (newArr[newArr.length/2]+newArr[newArr.length/2 -1])/2.0;
        }
        else return newArr[newArr.length/2];
    }
}
