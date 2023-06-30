class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int len = (int) Math.log10(x) + 1;
        int powLeft = (int) Math.pow(10, len - 1);
        
        for (int i = 1; i <= len / 2; i++) {
            int left = x / powLeft % 10;
            int right = x % 10;
            if (left != right) return false;
            
            x /= 10;
            powLeft /= 100;
        }
        
        return true;
    }
}