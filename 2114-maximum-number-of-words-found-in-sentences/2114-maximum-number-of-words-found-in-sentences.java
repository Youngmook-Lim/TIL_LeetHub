import java.util.*;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String x : sentences) {
            max = Math.max(max, x.split(" ").length);
        }
        return max;
    }
}