class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int x1 = i;
            int x2 = n - i - 1;
            sum += mat[i][x1];
            mat[i][x1] = 0;
            sum += mat[i][x2];
            mat[i][x2] = 0;
        }
        
        return sum;
    }
}