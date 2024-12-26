class Solution {
    public int smallestEqual(int[] nums) {
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}