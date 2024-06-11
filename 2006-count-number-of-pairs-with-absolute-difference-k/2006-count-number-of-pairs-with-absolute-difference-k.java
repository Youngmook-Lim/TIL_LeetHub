import java.util.*;

class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            if (map.containsKey(x + k)) {
                cnt += map.get(x + k);
            }
            if (map.containsKey(x - k)) {
                cnt += map.get(x - k);
            }
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        return cnt;
    }
}