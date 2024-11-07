class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n = 0;
        int cnt = 0;
        for (int num : nums) {
            n += num;
            if (n == 0) cnt++;
        }
        return cnt;
    }
}