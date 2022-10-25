package POTD;
public class Equivalent_String_arrays {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str=new StringBuilder();
        StringBuilder str1=new StringBuilder();
        for(String st:word1)
            str.append(st);
        for(String st:word2)
            str1.append(st);
        System.out.println(str+" second string "+str1);
        return String.valueOf(str).equals(String.valueOf(str1));
    }
}
