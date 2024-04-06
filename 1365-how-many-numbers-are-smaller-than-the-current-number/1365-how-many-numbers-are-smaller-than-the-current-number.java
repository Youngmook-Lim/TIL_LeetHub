import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> sorted = new ArrayList<>();
        for (int x : nums) {
            sorted.add(x);
        }
        Collections.sort(sorted);
        
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = sorted.indexOf(nums[i]);
        }
        
        return result;
    }
}