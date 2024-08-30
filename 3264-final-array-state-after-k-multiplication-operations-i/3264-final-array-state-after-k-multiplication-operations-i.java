class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int minValue;
        int minIdx;
        while (k-- > 0) {
            minValue = Integer.MAX_VALUE;
            minIdx = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < minValue) {
                    minValue = nums[i];
                    minIdx = i;
                }
            }
            nums[minIdx] *= multiplier;
        }
        return nums;
    }
}