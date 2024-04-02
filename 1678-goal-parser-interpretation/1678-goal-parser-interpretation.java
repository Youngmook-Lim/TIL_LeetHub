import java.util.*;

class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char cur = command.charAt(i);
            if (cur == 'G') {
                sb.append(cur);
            } else if (cur == '(' && i < command.length() - 1) {
                if (command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i++;
                } else if (i < command.length() - 3 && command.charAt(i + 1) == 'a'
                          && command.charAt(i + 2) == 'l' && command.charAt(i + 3) == ')') {
                    sb.append("al");
                    i += 3;
                }
            }
        }
        return sb.toString();
    }
}