import java.util.*;

class Solution {
    public int differenceOfSum(int[] nums) {
        int es = Arrays.stream(nums).sum();
        int ds = 0;
        for (int x : nums) {
            String s = Integer.toString(x);
            for (int i = 0; i < s.length(); i++) {
                ds += s.charAt(i) - '0';
            }
        }
        return Math.abs(es - ds);
    }
}