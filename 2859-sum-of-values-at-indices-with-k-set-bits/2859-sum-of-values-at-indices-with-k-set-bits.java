class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            String cur = Integer.toBinaryString(i);
            int cnt = 0;
            for (int j = 0; j < cur.length(); j++) {
                if (cur.charAt(j) == '1') cnt++;
            }
            if (cnt == k) sum += nums.get(i);
        }
        return sum;
    }
}