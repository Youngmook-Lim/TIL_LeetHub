class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
            if (arr[c - 'a'] == 2) {
                return c;
            }
        }
        return '0';
    }
}