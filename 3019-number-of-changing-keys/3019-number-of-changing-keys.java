class Solution {
    public int countKeyChanges(String s) {
        int cnt = 0;
        char prev = '-';
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                c = (char) (c + ('A' - 'a'));   
            }
            if (prev != '-') {   
                if (c != prev) cnt++;
            }
            prev = c;
        }
        return cnt;
    }
}