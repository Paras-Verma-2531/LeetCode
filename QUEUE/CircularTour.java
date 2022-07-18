package QUEUE;
public class CircularTour {
    /*
    Ques :Suppose there is a circle. There are N petrol pumps on that circle. You will be given two sets of data.
1. The amount of petrol that every petrol pump has.
2. Distance from that petrol pump to the next petrol pump.
Find a starting point where the truck can start to get through the complete circle without exhausting its petrol in between.
Note :  Assume for 1 litre petrol, the truck can go 1 unit of distance
     */
    int tour(int petrol[], int distance[])
    {
        int balance=0;
        int deficit=0;
        int start=0;
        int n=petrol.length;
        for(int i=start;i<n;i++)
        {
            balance+=petrol[i]-distance[i];
            if(balance<0)
            {
                deficit+=balance;
                balance=0;
                start=i+1;
            }
        }
        return deficit+balance>=0?start:-1;
    }
}
