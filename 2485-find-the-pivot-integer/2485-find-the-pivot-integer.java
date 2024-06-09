import java.util.*;

class Solution {
    public int pivotInteger(int n) {
        
        double sumSquared = (double) (n * (n + 1) / 2);
        int sum = (int) Math.sqrt(sumSquared);
        if (sum * sum == sumSquared) return sum;
        return -1;
    }
}