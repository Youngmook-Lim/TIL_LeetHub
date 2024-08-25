class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        int cnt = 0;
        for (String x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (String x : arr) {
            int freq = map.get(x);
            if (freq != 1) continue;
            cnt++;
            if (cnt == k) {
                return x;
            }
        }
        return "";
    }
}