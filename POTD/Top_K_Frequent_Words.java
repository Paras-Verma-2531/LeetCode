package POTD;
import java.util.*;
public class Top_K_Frequent_Words {
    /*
    Ques:https://leetcode.com/problems/top-k-frequent-words/
     */
    class Pair
    {
        public String word;
        public int freq;
        public Pair(String word,int freq)
        {
            this.word=word;
            this.freq=freq;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String str:words)
            map.put(str,map.getOrDefault(str,0)+1);
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair a,Pair b)
            {
                if(a.freq==b.freq)return a.word.compareTo(b.word);
                return b.freq-a.freq;
            }
        });
        for (String key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));
        }
        LinkedList<String>list=new LinkedList<>();
        while(k--!=0)
            list.add(pq.poll().word);
        return list;
    }
}
