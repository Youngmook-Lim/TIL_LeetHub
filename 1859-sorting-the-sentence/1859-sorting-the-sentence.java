import java.util.*;

class Solution {
    public String sortSentence(String s) {
        TreeMap<Integer, String> map = new TreeMap<>();
        String[] words = s.split(" ");
        for (String x : words) {
            String word = x.substring(0, x.length() - 1);
            int n = Integer.parseInt(x.substring(x.length() - 1));
            map.put(n, word);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : map.keySet()) {
            sb.append(map.get(i)).append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}