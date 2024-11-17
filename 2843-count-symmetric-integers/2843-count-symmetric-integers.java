class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        for (int n = low; n <= high; n++) {
            if (isSymmetric(n)) cnt++;
        }
        return cnt;
    }
    
    public boolean isSymmetric(int n) {
        String s = Integer.toString(n);
        int len = s.length();
        if (len % 2 == 1) return false;
        int left = 0;
        int right = 0;
        for (int i = 0; i < len / 2; i++) {
            left += s.charAt(i) - '0';
            right += s.charAt(len - i - 1) - '0';
        }
        return left == right;
    }
}