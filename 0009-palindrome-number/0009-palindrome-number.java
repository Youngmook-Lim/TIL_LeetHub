class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        
        int len = (int) Math.log10(x) + 1;
        
        for (int i = 1; i <= len / 2; i++) {
            int left = (int) (x / Math.pow(10, (len - i)) % 10);
            int right = (int) (x % Math.pow(10, i) / Math.pow(10, i - 1));
            // System.out.println(left + " " + right);
            if (left != right) return false;
        }
        
        return true;
    }
}