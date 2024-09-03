class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') {
                flag = true;
            }
            if (flag) {
                sb.append(num.charAt(i));
            }
        }
        return sb.reverse().toString();
    }
}