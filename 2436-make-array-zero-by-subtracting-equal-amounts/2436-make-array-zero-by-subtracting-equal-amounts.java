class Solution {
    public int minimumOperations(int[] nums) {
        int cnt = 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        if (set.contains(0)) {
            return set.size() - 1;
        } else {
            return set.size();
        }
    }
}