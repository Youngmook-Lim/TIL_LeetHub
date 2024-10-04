class Solution {
    public int repeatedNTimes(int[] nums) {
        int[] arr = new int[10001];
        for (int x : nums) {
            if (arr[x]++ == 1) {
                return x;
            }
        }
        return -1;
    }
}