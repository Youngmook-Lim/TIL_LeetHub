class Solution {
    public int minTimeToType(String word) {
        char prev = 'a';
        int cnt = 0;
        
        for (char c : word.toCharArray()) {
            cnt += Math.min(Math.abs(c - prev), 26 - Math.abs(c - prev)) ;
            cnt++;
            prev = c;
        }
        
        return cnt;
        
    }
}