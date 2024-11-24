class Solution {
    public int countGoodSubstrings(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (i == 0) {
                for (int j = 0; j < 3; j++) {
                    char c = s.charAt(j);
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
            } else {
                char front = s.charAt(i - 1);
                char back = s.charAt(i + 2);
                if (map.get(front) == 1) {
                    map.remove(front);
                } else {
                    map.put(front, map.get(front) - 1);
                }
                map.put(back, map.getOrDefault(back, 0) + 1);
            }
            if (isGoodString(map)) cnt++;
        }
        return cnt;
    }
    
    public boolean isGoodString(Map<Character, Integer> map) {
        for (Character c : map.keySet()) {
            if (map.get(c) > 1) return false;
        }
        return true;
    }
}