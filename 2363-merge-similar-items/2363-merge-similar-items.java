class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] arr = new int[1001];
        int cnt = 0;
        for (int[] array : items1) {
            int v = array[0];
            int q = array[1];
            if (arr[v] == 0) cnt++;
            arr[v] += q;
        }
        for (int[] array : items2) {
            int v = array[0];
            int q = array[1];
            if (arr[v] == 0) cnt++;
            arr[v] += q;
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < 1001; i++) {
            if (arr[i] != 0) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(arr[i]);
                res.add(list);
            }
        }
        return res;
    }
}