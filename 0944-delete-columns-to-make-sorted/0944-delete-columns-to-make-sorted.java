class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            if (isNotSorted(i, strs)) cnt++;
        }
        return cnt;
    }
    
    public boolean isNotSorted(int n, String[] strs) {
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i + 1].charAt(n) - strs[i].charAt(n) < 0) return true;
        }
        return false;
    }
}