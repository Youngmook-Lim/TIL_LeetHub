class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int cnt = 0;
        boolean[] visited = new boolean[201];
        
        for (int num : nums) {
            if (num >= diff * 2) {
                if (visited[num - diff] && visited[num - 2 * diff]) cnt++;
            }
            visited[num] = true;
        }
        
        return cnt;
    }
}