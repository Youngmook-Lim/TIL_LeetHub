class Solution {
    public boolean halvesAreAlike(String s) {

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i < s.length() / 2) {
                if (isVowel(c)) cnt++;
            } else {
                if (isVowel(c)) cnt--;
            }
        }
        
        return cnt == 0;
        
    }
    
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}