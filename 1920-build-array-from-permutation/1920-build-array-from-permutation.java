import java.util.*;

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        
        // a = qb + r
        for (int i = 0; i < n; i++) {
            int r = nums[i];
            int b = nums[nums[i]] % n;
            
            nums[i] = n * b + r;
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        
        return nums;
    }
}