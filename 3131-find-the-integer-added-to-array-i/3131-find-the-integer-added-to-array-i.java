class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int a1 = Arrays.stream(nums1).min().getAsInt();
        int a2 = Arrays.stream(nums2).min().getAsInt();
        
        return a2 - a1;
    }
}