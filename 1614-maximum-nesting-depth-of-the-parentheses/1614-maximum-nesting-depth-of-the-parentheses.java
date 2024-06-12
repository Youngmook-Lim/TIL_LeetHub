import java.util.*;

class Solution {
    public int maxDepth(String s) {
        int max = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur != '(' && cur != ')') continue;
            if (cur == '(') {
                stack.push(cur);
            } else {
                stack.pop();
            }
            max = Math.max(max, stack.size());
        }
        return max;
    }
}