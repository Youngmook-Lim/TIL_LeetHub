class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] graph = new int[m][n];
        int cnt = 0;
        
        for (int[] arr : indices) {
            for (int i = 0; i < m; i++) {
                graph[i][arr[1]]++;
                if (graph[i][arr[1]] % 2 == 0) {
                    cnt--;
                } else {
                    cnt++;
                }
            }
            for (int i = 0; i < n; i++) {
                graph[arr[0]][i]++;
                if (graph[arr[0]][i] % 2 == 0) {
                    cnt--;
                } else {
                    cnt++;
                }
            }
        }
    
        return cnt;
    }
}