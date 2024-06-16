import java.util.*;

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);
        int ret = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (ret == -1) {
                    ret = nums[i];
                } else {
                    ret ^= nums[i];
                }
                i++;
            }
        }
        return ret == -1 ? 0 : ret;
    }
}