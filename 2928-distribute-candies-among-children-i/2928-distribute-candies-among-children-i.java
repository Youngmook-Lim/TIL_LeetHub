class Solution {
    
    int cnt = 0;
     
    public int distributeCandies(int n, int limit) {
        
        for (int i = 0; i <= Math.min(n, limit); i++) {
            for (int j = 0; j <= Math.min(n - i, limit); j++) {
                int k = n - i - j;
                if (k >= 0 && k <= limit) cnt++;
            }
        }
        
        return cnt;
    }
    

}