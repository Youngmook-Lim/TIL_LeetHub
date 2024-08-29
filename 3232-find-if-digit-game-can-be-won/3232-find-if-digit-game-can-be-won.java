class Solution {
    public boolean canAliceWin(int[] nums) {
        int alice = 0;
        int bob = 0;
        for (int x : nums) {
            if (x / 10 >= 1) {
                alice += x;
            } else {
                bob += x;
            }
        }
        return alice != bob;
    }
}