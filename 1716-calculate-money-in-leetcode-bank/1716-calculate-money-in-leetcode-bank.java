class Solution {
    public int totalMoney(int n) {
        
        int m = n / 7;
        int prev = 28;
        int total = 0;
        int cnt = 1;
        for (int i = 0; i < m; i++) {
            total += prev;
            prev += 7;
            cnt++;         
        }
        
        for (int i = 0; i < n % 7; i++) {
            total += cnt++;
        }
        
        return total;
        
    }
}