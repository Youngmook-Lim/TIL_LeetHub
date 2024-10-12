class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        int lessThan = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                lessThan++;
            } else if (nums[i] == target) {
                cnt++;
            }    
        }
        
        for (int i = 0; i < cnt; i++) {
            list.add(lessThan++);
        }
        
        return list;
    }
}