class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] arr = new int[rows * cols][2];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[idx][0] = i;
                arr[idx++][1] = j;
            }
        }
        Arrays.sort(arr, (a, b) -> {
            int aDist = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int bDist = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return aDist - bDist;
        });
        return arr;
    }
}