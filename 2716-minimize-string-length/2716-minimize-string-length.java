class Solution {
    public int minimizedStringLength(String s) {
        boolean[] arr = new boolean[26];
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (!arr[c - 'a']) {
                arr[c - 'a'] = true;
                sum++;
            }
        }
        return sum;
    }
}