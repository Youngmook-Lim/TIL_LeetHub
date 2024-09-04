class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int cnt = 0;
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (int[] r : rectangles) {
            int n = Math.min(r[0], r[1]);
            list.add(n);
        }
        
        for (int s : list) {
            if (s >= max) {
                if (s == max) {
                    cnt++;
                } else {
                    cnt = 1;
                    max = s;
                }
            }
        }
        
        return cnt;
    }
}