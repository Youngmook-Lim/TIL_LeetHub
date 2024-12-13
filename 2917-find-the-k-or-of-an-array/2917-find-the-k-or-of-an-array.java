class Solution {
    public int findKOr(int[] nums, int k) {
        int bit = 0;
        int result = 0;
        while (true) {
            int cnt = 0;
            boolean flag = false;
            for (int n : nums) {
                if ((1 << bit) - 1 < n) flag = true;
                if ((n & (1 << bit)) > 0) cnt++;
            }
            if (!flag) break;
            if (cnt >= k) {
                result += 1 << bit;
            }
            bit++;
        }
        return result;
    }
}