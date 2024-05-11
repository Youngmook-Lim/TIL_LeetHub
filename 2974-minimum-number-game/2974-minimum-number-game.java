import java.util.*;

class Solution {
    public int[] numberGame(int[] nums) {  
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i += 2) {
            int a = nums[i];
            int b = nums[i + 1];
            result[i] = b;
            result[i + 1] = a;
        }
        return result;
    }
}