class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] arr = new int[101];
        boolean[] visited;
        
        visited = new boolean[101];
        for (int n : nums1) {
            if (!visited[n]) {
                visited[n] = true;
                arr[n]++;
            }
        }
        
        visited = new boolean[101];
        for (int n : nums2) {
            if (!visited[n]) {
                visited[n] = true;
                arr[n]++;
            }
        }
        
        visited = new boolean[101];
        for (int n : nums3) {
            if (!visited[n]) {
                visited[n] = true;
                arr[n]++;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            if (arr[i] >= 2) {
                list.add(i);
            }
        }
        return list;
    }
}