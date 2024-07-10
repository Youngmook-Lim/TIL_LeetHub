class Solution {
    public int countAsterisks(String s) {
        int cnt = 0;
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (c == '|') {
                flag = !flag;
            } else if (c == '*' && !flag) {
                cnt++;
            }
        }
        return cnt;
    }
}