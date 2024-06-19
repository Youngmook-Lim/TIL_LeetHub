class Solution {
    public int largestAltitude(int[] gain) {
        int curAlt = 0;
        int maxAlt = 0;
        for (int x : gain) {
            curAlt += x;
            maxAlt = Math.max(maxAlt, curAlt);
        }
        return maxAlt;
    }
}