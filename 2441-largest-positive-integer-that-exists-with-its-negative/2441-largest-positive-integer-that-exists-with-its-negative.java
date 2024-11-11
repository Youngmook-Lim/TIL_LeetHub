class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int left = 0;
        int right = n;
        while (right > left) {
            if (nums[right] == -nums[left]) {
                return nums[right];
            } else if (nums[right] > -nums[left]) {
                right--;
            } else {
                left++;
            }
        }
        return -1;
    }
}