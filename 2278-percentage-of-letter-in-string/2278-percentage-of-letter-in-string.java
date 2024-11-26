class Solution {
    public int percentageLetter(String s, char letter) {
        double n = (double) s.length();
        double k = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) k++;
        }
        return (int) Math.floor(k * 100 / n); 
    }
}