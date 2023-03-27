package ARRAYS;
import java.util.Arrays;
import java.util.Scanner;
public class garvFile {
    public static int[] fibonacci(int n)
    {
        int[]arr=new int[n+1];
        arr[0]=0;arr[1]=1;
        if(n<2)return arr;
        for(int i=2;i<=n;i++)
            arr[i]=arr[i-1]+arr[i-2];
        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num=in.nextInt();
        System.out.println("the fibonacci series till "+num+" index is : " + Arrays.toString(fibonacci(num)));
    }
}
