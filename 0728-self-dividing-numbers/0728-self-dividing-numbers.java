class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) list.add(i);
        }
        return list;
    }
    
    public boolean isSelfDividing(int n) {
        int m = n;
        
        while (m > 0) {
            int c = m % 10;
            if (c == 0) return false;
            if (n % c != 0) return false;
            m /= 10;
        }
        
        return true;
    }
}