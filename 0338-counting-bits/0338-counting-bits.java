class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            arr[i] = getOnes(i);
        }
        
        return arr;
    }
    
    public int getOnes(int n) {
        int len = Integer.toBinaryString(n).length();
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if ((n & (1 << i)) > 0) cnt++;
        }
        return cnt;
    }
}