class Solution {
    class P implements Comparable<P>{
        int n, r;
        P(int n, int r) {
            this.n = n;
            this.r = r;
        }
        
        @Override
        public int compareTo(P p) {
            if (this.n != p.n) {
                return this.n - p.n;
            }
            return this.r - p.r;
        }
    }
    
    public int[] kWeakestRows(int[][] mat, int k) {
        List<P> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int n = 0;
            for (int x : mat[i]) {
                if (x == 1) {
                    n++;
                } else {
                    break;
                }
            }
            list.add(new P(n, i));
        }
        Collections.sort(list);
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i).r;
        }
        return arr;
    }
}