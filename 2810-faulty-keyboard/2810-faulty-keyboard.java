class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == 'i') {
                sb.reverse();
            } else {
                sb.append(cur);
            }
        }
        return sb.toString();
    }
}