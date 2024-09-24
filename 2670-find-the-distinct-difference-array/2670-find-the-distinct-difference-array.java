class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Map<Integer, Integer> mapFront = new HashMap<>();
        Map<Integer, Integer> mapBack = new HashMap<>();
        for (int x : nums) {
            mapBack.put(x, mapBack.getOrDefault(x, 0) + 1);
        }
        
        int[] arr = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            mapFront.put(x, mapFront.getOrDefault(x, 0) + 1);
            if (mapBack.get(x) == 1) {
                mapBack.remove(x);
            } else {
                mapBack.put(x, mapBack.get(x) - 1);
            }
            arr[i] = mapFront.size() - mapBack.size();
        }
        return arr;
    }
}