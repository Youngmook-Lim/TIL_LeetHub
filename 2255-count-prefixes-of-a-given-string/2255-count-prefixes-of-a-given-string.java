class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt = 0;
        int len = s.length();
        for (String str : words) {
            if (len < str.length()) continue;
            boolean flag = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != s.charAt(i)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) cnt++;
        }
        return cnt;
    }
}