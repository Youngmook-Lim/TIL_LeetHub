class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String s : strs) {
            if (isDigits(s)) {
                max = Math.max(max, Integer.parseInt(s));
            } else {
                max = Math.max(max, s.length());
            }
        }
        return max;
    }
    
    public boolean isDigits(String s) {
        for (char c : s.toCharArray()) {
            if (c < '0' || c > '9') return false;
        }
        return true;
    }
}