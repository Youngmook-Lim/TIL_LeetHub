class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 2 && s.charAt(i + 2) == '#') {
                int n = Integer.parseInt(s.substring(i, i + 2));
                char c = (char) ('a' + n - 1);
                sb.append(c);
                i += 2;
            } else {
                int n = s.charAt(i) - '0';
                char c = (char) ('a' + n - 1);
                sb.append(c);
            }
        }
        
        return sb.toString();
        
    }
}