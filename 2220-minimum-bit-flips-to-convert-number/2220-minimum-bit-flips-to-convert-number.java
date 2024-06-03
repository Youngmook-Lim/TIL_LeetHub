import java.util.*;

class Solution {
    public int minBitFlips(int start, int goal) {
        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);
 
        if (s.length() < g.length()) {
            return getMinBitFlips(s, g);
        } else {
            return getMinBitFlips(g, s);
        }
        
    }
    
    private int getMinBitFlips(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int cnt = 0;
        
        for (int i = 0; i < bLen; i++) {
            char bChar = b.charAt(bLen - 1 - i);
            if (aLen - 1 - i < 0) {
                if (bChar == '1') cnt++;
            } else {
                char aChar = a.charAt(aLen - 1 - i);
                if (bChar != aChar) cnt++;
            }
        }
        
        return cnt;
    }
}