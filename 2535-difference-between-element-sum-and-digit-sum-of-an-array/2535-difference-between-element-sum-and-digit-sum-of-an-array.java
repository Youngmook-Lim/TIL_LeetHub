import java.util.Arrays;

class Solution {
    public int differenceOfSum(int[] nums) {
        int es = Arrays.stream(nums).sum();
        
        int ds = 0;
        for (int x : nums) {
            while (x > 0) {
                ds += x % 10;  
                x /= 10;       
            }
        }
        
        return Math.abs(es - ds);
    }
}