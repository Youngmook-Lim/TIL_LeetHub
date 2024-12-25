class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int total = 0;
        int subTotal = 0;
        
        for (int n : nums) {
            total += n;
        }
        
        Arrays.sort(nums);
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = nums.length - 1; i >= 0; i--) {
            total -= nums[i];
            subTotal += nums[i];
            list.add(nums[i]);
            if (subTotal > total) break;
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        return list;
    }
}