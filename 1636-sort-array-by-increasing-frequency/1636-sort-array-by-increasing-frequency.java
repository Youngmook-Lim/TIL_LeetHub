class Solution {
    
    class P implements Comparable<P> {
        int n, cnt;
        
        P(int n, int cnt) {
            this.n = n;
            this.cnt = cnt;
        }
        
        @Override
        public int compareTo(P p) {
            if (this.cnt != p.cnt) {
                return this.cnt - p.cnt;            
            }
            return p.n - this.n;
        }
    }
    
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<P> list = new ArrayList<>();
        for (Integer x : map.keySet()) {
            int cnt = map.get(x);
            for (int i = 0; i < cnt; i++) {
                list.add(new P(x, cnt));                
            }
        }
        Collections.sort(list);
        int[] ans = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i).n;
        }
        return ans;
    }
}