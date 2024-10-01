class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        for (int[] arr : grid) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] >= 0) break;
                cnt++;
            }
        }
        return cnt;
    }
}