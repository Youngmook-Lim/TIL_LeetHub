class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        char prev = ' ';
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i); 
            if (len != 0) {
                sb.append(cur);
            }
            
            if (prev == '(' && cur == ')' ) {
                len--;
                if (len == 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                len++;
                prev = cur;
            }
           
        }
        return sb.toString();
    }
}