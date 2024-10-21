class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[grid.length * grid.length + 1];
        int[] ans = new int[2];
        
        for (int[] array : grid) {
            for (int n : array) {
                if (arr[n] == 0) {
                    arr[n]++;
                } else {
                    ans[0] = n;
                }
            }
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                ans[1] = i;
            }
        }
        
        return ans;
    }
}