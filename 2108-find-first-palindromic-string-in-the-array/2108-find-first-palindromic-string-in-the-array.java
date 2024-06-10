class Solution {
    public String firstPalindrome(String[] words) {
        for (String w : words) {
            if (isPalindrome(w)) return w;
        }
        return "";
    }
    
    public boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) return false;
        }
        return true;
    }
}