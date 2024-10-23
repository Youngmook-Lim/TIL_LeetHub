class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int num = 1;
        int start = 0;
        
        if (n % 2 == 1) {
            start = 1;
        }
        
        for (int i = start; i < arr.length; i++) {
            arr[i] = num;
            if (num > 0) {
                num = -num;
            } else {
                num = -num + 1;
            }
        }
        return arr;
    }
}