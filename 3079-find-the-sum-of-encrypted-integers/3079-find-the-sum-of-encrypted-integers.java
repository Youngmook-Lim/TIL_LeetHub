class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            String str = Integer.toString(n);
            int len = str.length();
            int max = 0;
            for (char c : str.toCharArray()) {
                max = Math.max(max, c - '0');
            }
            for (int i = 0; i < len; i++) {
                sum += Math.pow(10, i) * max;
            }
        }
        return sum;
    }
}