class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ret = new int[2];
        
        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) cnt++;
            }
            if (ret[1] < cnt) {
                ret[0] = i;
                ret[1] = cnt;
            }
        }
        
        return ret;
    }
}