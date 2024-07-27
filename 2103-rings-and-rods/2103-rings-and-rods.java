import java.util.*;

class Solution {
    public int countPoints(String rings) {
        int n = 10;
        int cnt = 0;
        Set<Character>[] rods = new Set[n];
        for (int i = 0; i < rods.length; i++) {
            rods[i] = new HashSet<>();
        }
        for (int i = 0; i < rings.length(); i += 2) {
            char ring = rings.charAt(i);
            int num = rings.charAt(i + 1) - '0';
            Set<Character> set = rods[num];
            if (set == null) continue;
            set.add(ring);
            if (set.size() == 3) {
                rods[num] = null;
                cnt++;
            }
        }
        return cnt;
    }
}