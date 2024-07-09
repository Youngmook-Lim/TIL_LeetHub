class Solution {
    public int maximum69Number (int num) {
        int tmp = num;
        int sixPos = -1;
        int idx = 0;
        while (tmp > 0) {
            int digit = tmp % 10;
            if (digit == 6) {
                sixPos = idx;
            } 
            idx++;
            tmp /= 10;
        }
        if (sixPos == -1) {
            return num;
        } else {
            return num + 3 * (int) Math.pow(10, sixPos);
        }
        
    }
}