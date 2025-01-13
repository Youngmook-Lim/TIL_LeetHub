class Solution {
    public String makeFancyString(String s) {
        int cnt = 1;
        char prev = ' ';
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == prev) {
                cnt++;
            } else {
                cnt = 1;
                prev = c;
            }
            if (cnt < 3) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}