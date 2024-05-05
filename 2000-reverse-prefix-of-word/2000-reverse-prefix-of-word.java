class Solution {
    public String reversePrefix(String word, char ch) {
        
        if (!word.contains(Character.toString(ch))) return word;
        
        int idx = word.indexOf(ch);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (i >= 0 && i <= idx) {
                sb.append(word.charAt(idx - i));
            } else {
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
        
    }
}