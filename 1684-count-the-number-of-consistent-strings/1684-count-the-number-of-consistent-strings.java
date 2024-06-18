import java.util.*;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] visited = new boolean[26];
        int cnt = words.length;
        
        for (char c : allowed.toCharArray()) {
            visited[c - 'a'] = true;
        }

        loop:
        for (String x : words) {
            for (char c : x.toCharArray()) {
                if (!visited[c - 'a']) {
                    cnt--;
                    break;
                }
            }
        }
        return cnt;
    }
}