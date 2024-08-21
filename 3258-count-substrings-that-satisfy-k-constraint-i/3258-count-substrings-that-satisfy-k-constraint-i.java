class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0;
        int right = 0;
        int one = 0;
        int zero = 0;
        int n = s.length();
        int cnt = 0;
        
        while (right < n) {
            if (s.charAt(right) == '0') {
                zero++;
            } else {
                one++;
            }
            
            while (one > k && zero > k) {
                if (s.charAt(left) == '0') {
                    zero--;
                } else {
                    one--;
                }
                left++;
            }
            
            cnt += right - left + 1;
            
            right++;
        }
        
        
        return cnt;
    }
}