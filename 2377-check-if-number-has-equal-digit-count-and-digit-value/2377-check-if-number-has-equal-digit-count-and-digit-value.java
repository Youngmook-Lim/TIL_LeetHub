class Solution {
    public boolean digitCount(String num) {
        Map<Character, Integer> map = new HashMap<>();
        int[] arr = new int[10];
        for (char c : num.toCharArray()) {
            arr[c - '0']++;
        }

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) - '0' != arr[i]) return false;
        }
        return true;
    }
}