class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return numVal(firstWord) + numVal(secondWord) == numVal(targetWord);   
    }
    
    public int numVal(String s) {
        int idx = 0;
        int n = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            n += (s.charAt(i) - 'a') * Math.pow(10, idx++);
        }
        return n;
    }
}