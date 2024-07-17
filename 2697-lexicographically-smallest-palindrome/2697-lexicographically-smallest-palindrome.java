class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                if (arr[i] > arr[arr.length - i - 1]) {
                    arr[i] = arr[arr.length - i - 1];
                } else {
                    arr[arr.length - i - 1] = arr[i];
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }
}