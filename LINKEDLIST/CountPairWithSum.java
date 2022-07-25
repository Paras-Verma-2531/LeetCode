package LINKEDLIST;

import java.util.HashSet;
import java.util.LinkedList;
public class CountPairWithSum {
    /*
    Ques:Given two linked list of size N1 and N2 respectively of distinct elements, your task is to complete the function countPairs(),
     which returns the count of all pairs from both lists whose sum is equal to the given value X
     */
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                                 int x) {
        HashSet<Integer> set=new HashSet<>();int i=0;
        while(i<head1.size())
        {
            set.add(head1.get(i++));
            //head1=head1.next;
        }int count=0;i=0;
        while(i<head2.size())
        {
            if(set.contains(x-head2.get(i++)))//x+y=z [[ z-y]==x
                count++;
            //head2=head2.next;
        }return count;
    }
}
