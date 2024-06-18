import java.util.*;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int cnt = 0;
        
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        loop:
        for (String x : words) {
            for (char c : x.toCharArray()) {
                if (!set.contains(c)) continue loop;
            }
            cnt++;
        }
        return cnt;
    }
}