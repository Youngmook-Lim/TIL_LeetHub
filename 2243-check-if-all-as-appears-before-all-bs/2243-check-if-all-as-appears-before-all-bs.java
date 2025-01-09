class Solution {
    public boolean checkString(String s) {
        boolean hasBAppeared = false;
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                hasBAppeared = true;
            } else {
                if (hasBAppeared) {
                    return false;
                }
            }
        }
        return true;
    }
}