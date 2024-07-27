import java.util.*;

class Solution {
    public int countPoints(String rings) {
        int n = 10;
        int cnt = 0;
        int[] rods = new int[n];
        
        for (int i = 0; i < rings.length(); i += 2) {
            char ring = rings.charAt(i);
            int num = rings.charAt(i + 1) - '0';
            int rgb = 0;
            if (ring == 'R') {
                rgb = 1;
            } else if (ring == 'G') {
                rgb = 2;
            } else {
                rgb = 4;
            }
            
            rods[num] = rods[num] | rgb;
        }
        
        for (int x : rods) {
            if (x == 7) cnt++;
        }
        
        return cnt;
    }
}