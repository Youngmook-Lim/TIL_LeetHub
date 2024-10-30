class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt = 0;
        for (int i = 0; i < startTime.length; i++) {
            int start = startTime[i];
            int end = endTime[i];
            
            if (start <= queryTime && end >= queryTime) cnt++;
        }
        return cnt;
    }
}