class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] graph = new int[m][n];
        
        for (int[] arr : indices) {
            for (int i = 0; i < m; i++) {
                graph[i][arr[1]]++;
            }
            for (int i = 0; i < n; i++) {
                graph[arr[0]][i]++;
            }
        }
        
        int cnt = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] % 2 != 0) cnt++;
            }
        }
        
        return cnt;
    }
}