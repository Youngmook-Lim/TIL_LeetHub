class Solution {
    public String truncateSentence(String s, int k) {
        String[] tmp = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < k; i++) {
            sb.append(tmp[i]).append(' ');
        }
        
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}