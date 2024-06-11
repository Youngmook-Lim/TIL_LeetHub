import java.util.*;

class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            cnt += map.getOrDefault(x + k, 0) + map.getOrDefault(x - k, 0);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        return cnt;
    }
}