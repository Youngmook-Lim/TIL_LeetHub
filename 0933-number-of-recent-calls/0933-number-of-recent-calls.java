class RecentCounter {
    
    int[] list;
    int idx;
    int end;
    
    public RecentCounter() {
        list = new int[10001];
        idx = 0;
        end = 0;
    }
    
    public int ping(int t) {
        list[end++] = t;
        int tmp = t - 3000;
        
        while (idx < end) {
            if (list[idx] >= tmp) break;
            idx++;
        }
        return end - idx;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */