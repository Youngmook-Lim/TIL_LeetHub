import java.util.*;

class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String x : arr) {
            StringBuilder tmp = new StringBuilder(x);
            tmp.reverse();
            sb.append(tmp).append(' ');
        }

        return sb.toString().trim();
    }
}