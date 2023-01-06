package POTD;
import java.util.Arrays;
public class Maximum_Icecreams_Bar {
    /*
    Ques::https://leetcode.com/problems/maximum-ice-cream-bars/description/
     */
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        for(int i: costs)
        {
            if(i>coins)break;
            coins-=i;
            sum++;
        }
        return sum;
    }
}
