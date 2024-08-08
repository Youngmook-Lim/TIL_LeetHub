class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length; 
        int m = matrix[0].length;
        int[][] cnt = new int[n][m];
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int minI = 0;
            int minJ = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minI = i;
                    minJ = j;
                }
            }
            cnt[minI][minJ]++;
        }
        for (int j = 0; j < m; j++) {
            int max = Integer.MIN_VALUE;
            int maxI = 0;
            int maxJ = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
            cnt[maxI][maxJ]++;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (cnt[i][j] == 2) {
                    list.add(matrix[i][j]);
                }
            }
        }
        
        return list;
        
    }
}