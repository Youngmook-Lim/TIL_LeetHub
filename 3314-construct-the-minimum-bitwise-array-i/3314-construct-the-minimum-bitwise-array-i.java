class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            for (int j = 1; j < n; j++) {
                if ((j | (j + 1)) == n) {
                    res[i] = j;
                    break;
                }
            }
            if (res[i] == 0) {
                res[i] = -1;
            }
        }
        return res;
    }
}