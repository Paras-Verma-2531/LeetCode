package ARRAYS;
public class ReverseVowels {
    public String reverseVowels(String s) {
        if(s.length() < 2) return s;

        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;

        while(i < j) {
            while (i < j && str[i] != 'a' && str[i] != 'e' && str[i] != 'i' && str[i] != 'o' && str[i] != 'u'
                    && str[i] != 'A' && str[i] != 'E' && str[i] != 'I' && str[i] != 'O' && str[i] != 'U') {
                i++;
            }
            while (i < j && str[j] != 'a' && str[j] != 'e' && str[j] != 'i' && str[j] != 'o' && str[j] != 'u'
                    && str[j] != 'A' && str[j] != 'E' && str[j] != 'I' && str[j] != 'O' && str[j] != 'U') {
                j--;
            }
            if (i == j) {
                break;
            }
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(str);
    }
}
