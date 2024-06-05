import java.util.*;

class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        boolean[] alphabet = new boolean[26];
        
        for (int i = 0; i < key.length(); i++) {
            char cur = key.charAt(i);
            if (cur == ' ') continue;
            if (!alphabet[cur - 'a']) {
                sb.append(cur);
                alphabet[cur - 'a'] = true;
            }
        }
        
        key = sb.toString();

        sb = new StringBuilder();
        
        for (int i = 0; i < message.length(); i++) {
            char cur = message.charAt(i);
            if (cur == ' ') {
                sb.append(' ');
            } else {
                char decodedCur = (char) ('a' + key.indexOf(cur));
                sb.append(decodedCur);
            }
          
        }
        
        return sb.toString();
    }
}