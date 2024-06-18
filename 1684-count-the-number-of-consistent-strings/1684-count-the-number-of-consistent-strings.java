import java.util.*;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] visited = new boolean[26];
        int cnt = 0;
        
        for (char c : allowed.toCharArray()) {
            visited[c - 'a'] = true;
        }

        loop:
        for (String x : words) {
            for (char c : x.toCharArray()) {
                if (!visited[c - 'a']) continue loop;
            }
            cnt++;
        }
        return cnt;
    }
}