class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j + i < nums.size(); j++) {
                Set<Integer> set = new HashSet<>();
                for (int k = j; k <= j + i; k++) {
                    set.add(nums.get(k));
                }
                sum += Math.pow(set.size(), 2);
            }
        }
        
        return sum;
    }
}