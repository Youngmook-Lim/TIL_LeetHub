class Solution {
    public int commonFactors(int a, int b) {
        int gcd = getGcd(a, b);
        return getFactorCnt(gcd);
    }
    
    public int getFactorCnt(int x) {
        int cnt = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) cnt++;
        }
        return cnt;
    }
    
    public int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
}