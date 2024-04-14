class Solution {
    public int subtractProductAndSum(int n) {
        String s = Integer.toString(n);
        int product = 1;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            product *= digit;
            sum += digit;
        }
        return product - sum;
    }
}