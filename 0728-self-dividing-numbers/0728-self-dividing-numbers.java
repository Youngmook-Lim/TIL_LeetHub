class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) list.add(i);
        }
        return list;
    }
    
    public boolean isSelfDividing(int n) {
        String str = Integer.toString(n);
        
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - '0';
            if (c == 0) return false;
            if (n % c != 0) return false;
        }
        
        return true;
    }
}