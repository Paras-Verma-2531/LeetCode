package ARRAYS;
import java.util.Arrays;
public class DesignHashMap {
    /*
    Ques:: Design HashMap
    Approach:: use the array of given size and fill the index with -1::
    place the value at given index:
    */
    private int[] arr=new int[1000001];
    public DesignHashMap() {
        Arrays.fill(arr, -1);
    }

    public void put(int key, int value) {
        arr[key]=value;
    }

    public int get(int key) {
        return arr[key];
    }

    public void remove(int key) {
        arr[key]=-1;
    }
}
