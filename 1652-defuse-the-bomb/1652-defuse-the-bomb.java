class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + code[i];
        }
        System.out.println(Arrays.toString(sum));
        
        if (k < 0) {
            for (int i = 0 ; i < n; i++) {
                int pos = i;
                int start = i + k;
                if (start >= 0) {
                    arr[i] = sum[pos] - sum[start];
                } else {
                    arr[i] = sum[pos] + sum[n] - sum[n + start];
                }
            }
        } else if (k > 0) {
            for (int i = 0 ; i < n; i++) {
                int pos = i + 1;
                int end = i + k + 1;
                if (end < n) {
                    arr[i] = sum[end] - sum[pos];
                } else {
                    arr[i] = sum[n] - sum[pos] + sum[end - n];
                }
            }
        }
        return arr;
    }
}