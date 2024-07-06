class Solution {
    public int maxProduct(int[] nums) {
        int first = 0;
        int second = 0;
        Arrays.sort(nums);
        first = nums[nums.length - 1];
        second = nums[nums.length - 2];
        return (first - 1) * (second - 1);
    }
}