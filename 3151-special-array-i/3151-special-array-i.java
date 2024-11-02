class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int a = nums[i] % 2;
            int b = nums[i + 1] % 2;
            if (a == b) return false;
        }
        return true;
    }
}