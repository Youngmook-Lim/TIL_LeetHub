import java.util.*;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int idx = 0;
        int[] arr = new int[points.length];
        for (int[] x : points) {
            arr[idx++] = x[0];
        }
        Arrays.sort(arr);
        int maxDiff = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            maxDiff = Math.max(maxDiff, arr[i + 1] - arr[i]);
        }
        return maxDiff;
    }
}