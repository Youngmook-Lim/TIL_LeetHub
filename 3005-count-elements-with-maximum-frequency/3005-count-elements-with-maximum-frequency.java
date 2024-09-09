class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = 0;
        int cnt = 0;
        int[] arr = new int[101];
        for (int x : nums) {
            arr[x]++;
            max = Math.max(max, arr[x]);
        }
        for (int x : arr) {
            if (x == max) cnt += x;
        }
        return cnt;
    }
}