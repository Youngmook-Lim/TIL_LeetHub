class Solution {
    
    int cnt = 0;
     
    public int distributeCandies(int n, int limit) {
        dfs(n, limit, 1);
        
        return cnt;
    }
    
    public void dfs(int n, int limit, int depth) {
        if (depth == 3) {
            if (n <= limit) {
                cnt++;
            }
            return;
        }
        
        for (int i = 0; i <= limit; i++) {
            int tmp = n - i;
            if (tmp < 0) return;
            dfs(tmp, limit, depth + 1);
        }
        
    }
}