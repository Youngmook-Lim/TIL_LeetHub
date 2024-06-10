class Solution {
    public String firstPalindrome(String[] words) {
        for (String w : words) {
            String r = new StringBuilder(w).reverse().toString();
            if (w.equals(r)) return w;
        }
        return "";
    }
    
}