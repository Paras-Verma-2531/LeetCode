package ARRAYS.BINARY_SEARCH;

public class FindSqrt {
/*   Linear search approach :: O(N)
    public static int findSqrt(int n)
    {
     for(int i=1;i<=n;i++)
     {
         if(i*i>n)return i-1;
     }return 1;
    }*/
    //Binary search approach :: O(nlogn)
    public static int findSqrt(int n)
    {
        int start=1,end=n;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid*mid>n)end=mid-1;
            else start=mid+1;
        }
        return end;
    }
    public static void main(String[] args) {
        System.out.println(findSqrt(36));
    }
}
