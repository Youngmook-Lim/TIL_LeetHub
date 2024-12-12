class Solution {
    public long pickGifts(int[] gifts, int k) {
        long total = 0;
        int idx = gifts.length - 1;
        Queue<Integer> pq = new PriorityQueue<>();
        for (int n : gifts) {
            pq.add(-n);
        }
        while (k-- > 0) {
            pq.add((int) -Math.sqrt(-pq.poll()));
        }
        while (!pq.isEmpty()) {
            total += -pq.poll();
        }
        return total;
    }
}