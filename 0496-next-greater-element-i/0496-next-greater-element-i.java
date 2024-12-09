class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            int ans = -1;
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == n) {
                    flag = true;
                }
                if (flag && nums2[j] > n) {
                    ans = nums2[j];
                    break;
                }
            }
            arr[i] = ans;
        }
        return arr;
    }
}