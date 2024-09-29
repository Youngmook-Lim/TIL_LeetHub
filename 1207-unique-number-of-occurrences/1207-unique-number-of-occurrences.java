class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] array = new int[2001];
        for (int x : arr) {
            array[x + 1000]++;
        }
        
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            int n = array[x + 1000];
            if (n == 0) continue;
            if (set.contains(n)) return false;
            set.add(n);
            array[x + 1000] = 0;
        }
        return true;
    }
}