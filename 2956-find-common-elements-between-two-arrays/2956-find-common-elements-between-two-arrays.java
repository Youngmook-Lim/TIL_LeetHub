class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] arr1 = new int[101];
        int[] arr2 = new int[101];
        for (int x : nums1) {
            arr1[x]++;
        } 
        for (int x : nums2) {
            arr2[x]++;
        }
        int a = 0;
        int b = 0;
        for (int x : nums2) {
            a += arr1[x];
            arr1[x] = 0;
        }
        for (int x : nums1) {
            b += arr2[x];
            arr2[x] = 0;
        }
        return new int[] {a, b};
    }
}