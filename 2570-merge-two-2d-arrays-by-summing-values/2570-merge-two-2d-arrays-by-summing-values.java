class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int[] arr : nums1) {
            int id = arr[0];
            int val = arr[1];
            map.put(id, map.getOrDefault(id, 0) + val);
        }
        for (int[] arr : nums2) {
            int id = arr[0];
            int val = arr[1];
            map.put(id, map.getOrDefault(id, 0) + val);
        }
        int[][] res = new int[map.size()][2];
        int idx = 0;
        for (Integer id : map.keySet()) {
            res[idx][0] = id;
            res[idx][1] = map.get(id);
            idx++;
        }
        return res;
    }
}