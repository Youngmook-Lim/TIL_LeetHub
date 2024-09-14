class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            int[] arr = grid[i];
            Arrays.sort(arr);
        }
        int cnt = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(grid[j][i], max);
            }
            cnt += max;
        }
        return cnt;
    }
}