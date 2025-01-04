class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int idx1 = 0;
        int idx2 = 0;
        int idx = 0;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (i == 0) {
                arr1[idx1++] = num;
            } else if (i == 1) {
                arr2[idx2++] = num;
            } else {
                if (arr1[idx1 - 1] > arr2[idx2 - 1]) {
                    arr1[idx1++] = num;
                } else {
                    arr2[idx2++] = num;
                }
            }
        }

        for (int i = 0; i < idx1; i++) {
            result[idx++] = arr1[i];
        }
        for (int i = 0; i < idx2; i++) {
            result[idx++] = arr2[i];
        }

        return result;
    }
}