import java.util.*;

class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String x : arr) {
            for (int i = x.length() - 1; i >= 0; i--) {
                sb.append(x.charAt(i));
            }
            sb.append(' ');
        }

        return sb.toString().trim();
    }
}