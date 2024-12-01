class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Integer n : map.keySet()) {
            if (map.get(n) % 2 == 1) return false;
        }
        return true;
    }
}