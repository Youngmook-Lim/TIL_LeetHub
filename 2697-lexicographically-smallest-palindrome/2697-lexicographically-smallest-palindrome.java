class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int cnt = 0;
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            if (arr[left] != arr[right]) {
                if (arr[left] > arr[right]) {
                    arr[left] = arr[right];
                } else {
                    arr[right] = arr[left];
                }
                cnt++;
            }
            
            left++;
            right--;
        }
        
        if (cnt == 0) {
            return s;
        }
        
        return new String(arr);
    }
}