import java.util.*;

class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur != '(' && cur != ')') continue;
            if (cur == '(') {
                cnt++;
            } else {
                cnt--;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}