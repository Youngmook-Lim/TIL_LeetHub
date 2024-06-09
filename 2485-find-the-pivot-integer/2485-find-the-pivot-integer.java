import java.util.*;

class Solution {
    public int pivotInteger(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + i;
        }
        
        for (int i = 1; i <= n; i++) {
            int frontSum = arr[i];
            int backSum = arr[n] - arr[i] + i;
            if (frontSum == backSum) return i;
        }
        
        return -1;
    }
}