class Solution {
    public int minTimeToType(String word) {
        char prev = 'a';
        int cnt = 0;
        
        for (char c : word.toCharArray()) {
            int abs = Math.abs(c - prev);
            if (abs <= 13) {
                cnt += abs + 1;
            } else {
                cnt += 27 - abs;
            }
            prev = c;
        }
        
        return cnt;
        
    }
}