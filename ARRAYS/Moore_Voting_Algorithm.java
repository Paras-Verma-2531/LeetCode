package ARRAYS;
public class Moore_Voting_Algorithm {
    static int majorityElement(int a[], int size)
    {
        //Moore's Voting Algo [for majority element]
        int ansInd=0,count=1;//assume a[0] is the majority element with count as 1
        for(int i=1;i<size;i++)
        {
            if(a[i]==a[ansInd])count++;// make count++ if a[i]==a[0]
            else
                count--;//lower its preference
            if(count==0)
            {
                ansInd=i;//update the majority index with current i
                count=1;
            }
        }count=0;
        for(int i: a)// again traverse the array
            if(i==a[ansInd])count++;
        return count>(size/2)?a[ansInd]:-1;
    }
}
