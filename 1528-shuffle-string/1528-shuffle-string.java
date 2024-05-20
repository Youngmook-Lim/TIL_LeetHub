class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charArr = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            charArr[indices[i]] = s.charAt(i); 
        }
        StringBuilder sb = new StringBuilder();
        for (char x : charArr) {
            sb.append(x);
        }
        return sb.toString();
    }
}