class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0;
        int right = 1;
        int one = 0;
        int zero = 0;
        int n = s.length();
        int cnt = 0;
        if (s.charAt(left) == '1') {
            one++;
        } else {
            zero++;
        }
        while (left < n) {
            String ss = s.substring(left, right);
            
            if (one <= k || zero <= k) {
                right++;
                if (right == n + 1) {
                    left++;
                    right = left + 1;
                    one = 0;
                    zero = 0;
                    if (left < n) {
                        if (s.charAt(left) == '1') {
                            one++;
                        } else {
                            zero++;
                        }
                    }
                } else {
                    if (s.charAt(right - 1) == '1') {
                        one++;
                    } else {
                        zero++;
                    }
                }
                cnt++;
            } else {
                left++;
                right = left + 1;
                one = 0;
                zero = 0;
                if (left < n) {
                    if (s.charAt(left) == '1') {
                        one++;
                    } else {
                        zero++;
                    }
                }
            }
            

            
        }
        return cnt;
    }
}