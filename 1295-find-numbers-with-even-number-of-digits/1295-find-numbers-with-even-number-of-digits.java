class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int x : nums) {
            int cnt = 0;
            while (x != 0) {
                x /= 10;
                cnt++;
            }
            if (cnt % 2 == 0) sum++;
        }
        return sum;
    }
}