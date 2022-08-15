package MATHS;
public class TrailingZerosInFactorial {
    /*
    Ques: Given an integer n, return the number of trailing zeroes in n!.
Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1
*/
    public int trailingZeroes(int n) {
        // 10 is the product of 2 and 5. In n!, we need to know how many 2 and 5,
        // and the number of zeros is the minimum of the number of 2 and the number of 5.
        //Since multiple of 2 is more than multiple of 5, the number of zeros is dominant by the number of 5.
        int res=0;
        for(int i=5;i<=n;i*=5)
            res+=n/i;
        return res;
    }
}
