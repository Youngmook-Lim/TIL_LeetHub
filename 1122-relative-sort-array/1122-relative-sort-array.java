class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        int idx = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int n : arr1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int n : arr2) {
            int size = map.get(n);
            for (int i = 0; i < size; i++) {
                arr[idx++] = n;
            }
            map.remove(n);
        }
        for (Integer n : map.keySet()) {
            int size = map.get(n);
            for (int i = 0; i < size; i++) {
                arr[idx++] = n;                    
            }
        }
        
        return arr;
    }
}