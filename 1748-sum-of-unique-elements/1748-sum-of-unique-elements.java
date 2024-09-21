class Solution {
    public int sumOfUnique(int[] nums) {
        int[] arr = new int[101];
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i = 0; i < 101; i++) {
            if (arr[i] != 1) continue;
            cnt += i;
        }
        return cnt;
    }
}