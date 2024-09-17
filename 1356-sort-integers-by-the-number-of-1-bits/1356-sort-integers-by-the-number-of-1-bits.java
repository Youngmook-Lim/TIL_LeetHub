import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nArr[i] = arr[i];
        }
        
        Arrays.sort(nArr, (a, b) -> {
            if (count(a) != count(b)) {
                return count(a) - count(b);
            }
            return a - b;
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nArr[i];
        }
        return arr;
    }
    
    public int count(int a) {
        int cnt = 0;
        while (a > 0) {
            a &= (a - 1);
            cnt++;
        }
        return cnt;
    }
}