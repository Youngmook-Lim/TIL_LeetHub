class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            int s = 0;
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }
            min = Math.min(min, s);
        }
        return min;
    }
}