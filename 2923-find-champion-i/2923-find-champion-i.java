class Solution {
    public int findChampion(int[][] grid) {
        int winner = 0;
        int winnerTotal = 0;
        for (int i = 0; i < grid.length; i++) {
            int sum = 0;
            for (int x : grid[i]) {
                sum += x;
            }
            if (sum > winnerTotal) {
                winner = i;
                winnerTotal = sum;
            }
        }
        return winner;
    }
}