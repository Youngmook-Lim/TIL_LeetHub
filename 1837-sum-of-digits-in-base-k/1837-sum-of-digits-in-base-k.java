class Solution {
    public int sumBase(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % k);
            n /= k;
        }
        int sum = 0;
        for (char c : sb.reverse().toString().toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}