class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                if (arr[i] > arr[arr.length - i - 1]) {
                    arr[i] = arr[arr.length - i - 1];
                } else {
                    arr[arr.length - i - 1] = arr[i];
                }
                cnt++;
            }
        }
        
        if (cnt == 0) {
            return s;
        }
        
        return new String(arr);
    }
}