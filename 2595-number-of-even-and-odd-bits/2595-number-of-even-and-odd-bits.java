class Solution {
    public int[] evenOddBit(int n) {
        int[] arr = new int[2];
        int idx = 0;
        while (n > 0) {
            int bit = n & 1;
            if (bit == 1) {
                if (idx % 2 == 0) {
                    arr[0]++;
                } else {
                    arr[1]++;
                }
            }
            idx++;
            n >>= 1;
        }
        
        return arr;
    }
}