import java.util.*;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int idx = 0;
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int maxDiff = 0;
        for (int i = 0; i < points.length - 1; i++) {
            maxDiff = Math.max(maxDiff, points[i + 1][0] - points[i][0]);
        }
        return maxDiff;
    }
}