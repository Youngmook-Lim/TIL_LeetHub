class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        String str = Integer.toString(x);
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += c - '0';
        }
        if (x % sum == 0) {
            return sum;
        } else {
            return -1;
        }
    }
}