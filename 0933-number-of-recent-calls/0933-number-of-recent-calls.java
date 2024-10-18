class RecentCounter {
    
    List<Integer> list;
    int idx;
    
    public RecentCounter() {
        list = new ArrayList<>();
        idx = 0;
    }
    
    public int ping(int t) {
        list.add(t);
        int tmp = t - 3000;
        
        while (idx < list.size()) {
            if (list.get(idx) >= tmp) break;
            idx++;
        }
        return list.size() - idx;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */