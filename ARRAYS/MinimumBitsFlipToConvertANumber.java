package ARRAYS;
public class MinimumBitsFlipToConvertANumber {
    public int minBitFlips(int start, int goal) {
        int xor =start ^ goal;// since we need to find minimum bits : therefore ^ csn be used
        // ^ operator gives 1 only when both bits are diferent: [thus we only need to count occurence of 1]
        int count=0;
        while(xor!=0){
            if((xor&1)==1)count++;// if no is odd means [1 is present at last bit]
            xor>>=1;// reduces the no by one bit
        }
        /*
        Another approach::
         while(xor!=0)
         {
         count++;
         xor=xor&(xor-1) ----> this will change the set bit to 0 i,e 1-->0
         1101-->1100
         1100-->1000
         1000-->0000
         */
        return count;
    }
}
