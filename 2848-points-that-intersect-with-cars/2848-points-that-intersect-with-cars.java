class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int cnt = 0;
        int[] arr = new int[101];
        for (List<Integer> list : nums) {
            for (int i = list.get(0); i <= list.get(1); i++) {
                arr[i]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) cnt++;
        }
        return cnt;
    }
}