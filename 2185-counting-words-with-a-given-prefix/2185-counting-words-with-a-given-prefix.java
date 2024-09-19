class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        loop:
        for (String x : words) {
            if (x.length() < pref.length()) continue;
            for (int i = 0; i < pref.length(); i++) {
                if (pref.charAt(i) != x.charAt(i)) continue loop;
            }
            cnt++;
        }
        return cnt;
    }
}