class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] arr = new int[n + 1];
        int left = 0;
        int right = n;
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i) == 'I' ? left++ : right--;
        }
        arr[n] = right;
        return arr;
    }
}