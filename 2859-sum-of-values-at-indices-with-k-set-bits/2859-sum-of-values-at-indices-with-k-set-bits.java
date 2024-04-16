class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int cnt = 0;
            int n = i;
            while (n > 0) {
                n &= n - 1;
                cnt++;
            }
            if (cnt == k) sum += nums.get(i);
        }
        return sum;
    }
}