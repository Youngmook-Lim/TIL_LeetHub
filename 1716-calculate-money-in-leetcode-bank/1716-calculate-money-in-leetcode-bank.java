class Solution {
    public int totalMoney(int n) {
        int m = 1;
        int cur = m;
        int cnt = 0;
        int total = 0;
        while (n-- > 0) {
            total += cur++;
            cnt++;
            if (cnt == 7) {
                cur = ++m;
                cnt = 0;
            }
        }
        return total;
    }
}