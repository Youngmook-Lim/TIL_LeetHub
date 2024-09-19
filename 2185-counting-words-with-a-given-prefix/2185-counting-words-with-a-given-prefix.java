class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        loop:
        for (String x : words) {
            if (x.length() >= pref.length() && pref.equals(x.substring(0, pref.length()))) cnt++;
        }
        return cnt;
    }
}