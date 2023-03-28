package ARRAYS;
import java.util.ArrayList;
public class LeadersInArray {
    /*brute force Approach:: O(N^2)
    public ArrayList<Integer> leadersInArray(int[]arr,int size)
    {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    flag=false;
                    break;
                }
            }if(flag)list.add(arr[i]);
        }return list;
    }*/
    //Optimal Solution ::
    public ArrayList<Integer> leadersInArray(int[]arr,int size)
    {
        ArrayList<Integer>list=new ArrayList<>();
        int max=-11111;
        for(int i=arr.length-1;i>=0;i--)
        {
           if(arr[i]>max)list.add(arr[i]);
           max=Math.max(max,arr[i]);
        }return list;
    }
    public static void main(String[] args) {
        System.out.println(new LeadersInArray().leadersInArray(new int[]{1,2,5,6,2,3,4,1},8));
    }
}
