import java.util.*;

class Solution {
    public int minBitFlips(int start, int goal) {
        
        int cnt = 0;
        String xor = Integer.toBinaryString(start ^ goal);
        
        for (int i = 0; i < xor.length(); i++) {
            if (xor.charAt(i) == '1') cnt++;
        }
        
        return cnt;
        
    }
    
}