class Solution {
    public int getLucky(String s, int k) {
        
        int sum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int c = s.charAt(i) - 'a' + 1;
            while (c > 0) {
                sum += (c % 10);
                c /= 10;
            }
        }
        
        while (k-- > 1) {
            int tmp = 0;
            while (sum > 0) {
                tmp += sum % 10;
                sum /= 10;
            }
            
            sum = tmp;
            
        }
        
        return sum;
    }
}