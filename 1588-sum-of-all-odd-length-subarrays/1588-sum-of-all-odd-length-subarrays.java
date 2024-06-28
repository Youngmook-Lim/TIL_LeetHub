import java.util.*;

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int[] reduce = new int[arr.length + 1];
        for (int i = 1; i < reduce.length; i++) {
            reduce[i] = reduce[i - 1] + arr[i - 1];
        }
        
        int sum = 0;

        for (int k = 1; k < reduce.length; k += 2) {
            for (int i = 0; i < reduce.length - k; i++) {
                sum += reduce[i + k] - reduce[i];
            }
        }
        
        return sum;
    }
}