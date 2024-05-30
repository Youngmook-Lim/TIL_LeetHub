class Solution {
    public int countDigits(int num) {
        String strNum = Integer.toString(num);
        int cnt = 0;
        for (int i = 0; i < strNum.length(); i++) {
            int n = strNum.charAt(i) - '0';
            if (num % n == 0) cnt++;
        }
        return cnt;
    }
}