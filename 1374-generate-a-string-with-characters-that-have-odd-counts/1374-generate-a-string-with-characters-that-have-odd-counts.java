class Solution {
    public String generateTheString(int n) {
        if (n == 1) return "a";
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            sb.append('a');
            for (int i = 0; i < n - 1; i++) {
                sb.append('b');
            }
        } else {
            sb.append("ab");
            for (int i = 0; i < n - 2; i++) {
                sb.append('c');
            }
        }
        return sb.toString();
    }
}