class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int cnt = 0;
        int max = 0;
        Arrays.sort(rectangles, (a, b) -> Math.min(a[0], a[1]) - Math.min(b[0], b[1]));
        
        for (int[] r : rectangles) {
            int s = Math.min(r[0], r[1]);
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