class Solution {
    public boolean isArraySpecial(int[] nums) {
        int prev = nums[0] % 2;
        for (int i = 1; i < nums.length; i++) {
            int a = nums[i] % 2;
            if (a == prev) return false;
            prev = a;
        }
        return true;
    }
}