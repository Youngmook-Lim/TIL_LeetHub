class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int n = 0;
        boolean flag = false;
        for (char c : map.keySet()) {
            if (!flag) {
                n = map.get(c);
                flag = true;
            } else {
                if (map.get(c) != n) return false;
            }
        }
        return true;
    }
}