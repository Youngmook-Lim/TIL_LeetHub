class Solution {
    public int balancedStringSplit(String s) {
        int total = 0;
        int count = 1;
        char first = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == first) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                total++;
            }
        }
        return total;
    }
}