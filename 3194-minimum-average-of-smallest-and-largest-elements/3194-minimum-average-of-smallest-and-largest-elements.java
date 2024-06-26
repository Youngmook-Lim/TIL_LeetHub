import java.util.*;

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = 50;
        for (int i = 0; i < nums.length / 2; i++) {
            min = Math.min(min, (double) (nums[i] + nums[nums.length - 1 - i]) / 2);
        }
        return min;
    }
}