class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (containsZero(i)) continue;
            if (isSelfDividing(i)) list.add(i);
        }
        return list;
    }
    
    public boolean containsZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) return true;
            n /= 10;
        }
        return false;
    }
    
    public boolean isSelfDividing(int n) {
        int m = n;
        
        while (m > 0) {
            int c = m % 10;
            if (n % c != 0) return false;
            m /= 10;
        }
        
        return true;
    }
}