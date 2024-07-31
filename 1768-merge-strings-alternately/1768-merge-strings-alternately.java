class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int n = word1.length();
        int m = word2.length();
        while (idx < n || idx < m) {
            if (idx < n) {
                sb.append(word1.charAt(idx));
            }
            if (idx < m) {
                sb.append(word2.charAt(idx));
            }
            idx++;
        }
        return sb.toString();
    }
}