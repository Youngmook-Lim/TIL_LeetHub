class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            int x2 = points[i + 1][0];
            int y2 = points[i + 1][1];
            
            int x = Math.abs(x2 - x1);
            int y = Math.abs(y2 - y1);
            
            sum += getDistance(x, y);
        }
        return sum;
    }
    
    int getDistance(int x, int y) {
        return x < y ? y : x;
    }
}