class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int a1 = Integer.MAX_VALUE;
        int a2 = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums1.length; i++) {
            a1 = Math.min(a1, nums1[i]);
            a2 = Math.min(a2, nums2[i]);
        }
        
        return a2 - a1;
    }
}