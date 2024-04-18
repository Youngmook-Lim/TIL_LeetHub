import java.util.*;

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] tmp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            tmp[i + 1] = nums[i] + tmp[i];
        }

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            leftSum = tmp[i];
            rightSum = tmp[nums.length] - tmp[i + 1];
            arr[i] = Math.abs(leftSum - rightSum);
        }
        return arr;
    }
}