class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : target) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : arr) {
            if (map.get(n) == null) return false;
            if (map.get(n) == 1) {
                map.remove(n);
            } else {
                map.put(n, map.get(n) - 1);
            }
        }
        return true;
    }
}