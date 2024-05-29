class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = nums1[i];
                int b = nums2[j];
                if (a % (b * k) == 0) cnt++;
            }
        }
        
        return cnt;
    }
}