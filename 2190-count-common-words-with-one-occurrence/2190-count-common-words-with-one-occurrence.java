class Solution {
    public int countWords(String[] words1, String[] words2) {
        int cnt = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String s : words1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : words2) {
            if (map.containsKey(s) && map.get(s) <= 1) {
                map.put(s, map.get(s) - 1);
            }
        }
        for (String s : map.keySet()) {
            if (map.get(s) == 0) cnt++;
        }
        return cnt;
    }
}