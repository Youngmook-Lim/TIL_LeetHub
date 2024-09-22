class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        
        return getGcd(min, max);
    }
    
    public int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return getGcd(b, a % b);
    }
}