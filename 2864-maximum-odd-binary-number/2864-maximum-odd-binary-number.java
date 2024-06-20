import java.util.*;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('1');
        map.put('1', map.get('1') - 1);
        
        for (int i = 0; i < map.getOrDefault('0', 0); i++) {
            sb.append('0');
        }
        for (int i = 0; i < map.getOrDefault('1', 0); i++) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}