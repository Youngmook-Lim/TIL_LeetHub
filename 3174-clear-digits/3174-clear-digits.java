class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            int digitIdx = -1;
            int nonDigitIdx = -1;
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9') {
                    digitIdx = i;
                    break;
                }
            }
            for (int i = digitIdx - 1; i >= 0; i--) {
                if (sb.charAt(i) < '0' || sb.charAt(i) > '9') {
                    nonDigitIdx = i;
                    break;
                }
            }
            if (digitIdx != -1) {
                sb.deleteCharAt(digitIdx);
            }
            if (nonDigitIdx != -1) {
                sb.deleteCharAt(nonDigitIdx);
            }
            if (digitIdx == -1 && nonDigitIdx == -1) break;
        }
        return sb.toString();
    }
}