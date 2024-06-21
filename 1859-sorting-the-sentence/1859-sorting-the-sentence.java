import java.util.*;

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] arr = new String[words.length];
        
        for (String x : words) {
            String word = x.substring(0, x.length() - 1);
            int n = Integer.parseInt(x.substring(x.length() - 1));
            arr[n - 1] = word;
        }
        StringBuilder sb = new StringBuilder();
        for (String x : arr) {
            sb.append(x).append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}