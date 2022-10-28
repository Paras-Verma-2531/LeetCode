package POTD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class Anagram_Pairs {
    /*
    Ques::https://leetcode.com/problems/group-anagrams/
     */
    public List<List <String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap <>();
        for(int i=0;i<strs.length;i++){
            String s1=strs[i];
            char[] arr=s1.toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);

            if(map.containsKey(str)){
                map.get(str).add(s1);
            }else{
                map.put(str,new ArrayList <>());
                map.get(str).add(s1);
            }
        }
        return new ArrayList<>(map.values());
    }
}
