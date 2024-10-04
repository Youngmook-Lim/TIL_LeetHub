class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        int[] arr = new int[10001];
        for (int x : nums) {
            arr[x]++;
            if (arr[x] == n) {
                return x;
            }
        }
        return -1;
    }
}