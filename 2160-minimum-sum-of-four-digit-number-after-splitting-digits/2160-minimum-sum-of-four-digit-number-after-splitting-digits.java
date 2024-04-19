class Solution {
    public int minimumSum(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        Arrays.sort(digits);
        int num1 = (digits[0] - '0') * 10 + digits[3] - '0';
        int num2 = (digits[1] - '0') * 10 + digits[2] - '0';
        return num1 + num2;
    }
}