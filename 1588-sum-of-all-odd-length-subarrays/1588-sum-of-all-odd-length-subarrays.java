import java.util.*;

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int n = arr.length;
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += ((n - i) * (i + 1) + 1) / 2 * arr[i];
        }
        
        return sum;
    }
}