class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            
            map.get(nums[i]).add(i);
        }
        
        Arrays.sort(nums);
        
        System.out.println(map.get(3));
        
        int left = 0;
        int right = nums.length - 1;
        
        int[] solution = new int[2];
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                if (nums[left] == nums[right]) {
                    solution[0] = map.get(nums[left]).get(0);
                    solution[1] = map.get(nums[left]).get(1);
                } else {
                    solution[0] = map.get(nums[left]).get(0);
                    solution[1] = map.get(nums[right]).get(0);
                }
               
                return solution;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        
        return null;
    }
}