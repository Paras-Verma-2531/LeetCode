package ARRAYS;
import java.util.ArrayList;
import java.util.List;
public class OrderedStream {
    /*
    Ques: There is a stream of n (idKey, value) pairs arriving in an arbitrary order,
    where idKey is an integer between 1 and n and value is a string. No two pairs have the same id.
Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values after each insertion.
The concatenation of all the chunks should result in a list of the sorted values
     */
    private int ptr=0;
    private String[]arr;
    public OrderedStream(int n) {
        ptr=0;
        arr=new String[n];
    }
    public List<String> insert(int idKey, String value) {
        ArrayList<String>list=new ArrayList<>();
        arr[idKey-1]=value;
        while(ptr<arr.length&&arr[ptr]!=null)
            list.add(arr[ptr++]);
        return list;
    }
}
