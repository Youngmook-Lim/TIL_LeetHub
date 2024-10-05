class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[101];
        int[] ans = new int[2];
        int idx = 0;
        
        for (int n : nums) {
            arr[n]++;
            if (arr[n] == 2) {
                ans[idx++] = n;
                if (idx == 2) break;
            }
        }
        
        return ans;
    }
}