class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        int idx = grid[0].length - 1;
        for (int[] arr : grid) {
            while (idx >= 0) {
                if (arr[idx] >= 0) break;
                idx--;
            }

            cnt += grid[0].length - 1 - idx;
        }
        return cnt;
    }
}