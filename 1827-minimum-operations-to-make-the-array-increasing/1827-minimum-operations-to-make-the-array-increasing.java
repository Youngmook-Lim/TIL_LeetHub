class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i - 1];
            int cur = nums[i];
            if (cur <= prev) {
                cnt += prev - cur + 1;
                nums[i] = prev + 1;
            }
        }
        return cnt;
    }
}