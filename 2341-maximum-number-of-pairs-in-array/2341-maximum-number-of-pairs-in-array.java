class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int[] res = new int[2];
        for (int key : map.keySet()) {
            res[0] += map.get(key) / 2;
            res[1] += map.get(key) % 2;
        }
        return res;
    }
}