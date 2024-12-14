class Solution {
    public int smallestNumber(int n) {
        int num = 1;
        
        while (true) {
            if (num > n) break;
            num <<= 1;
        }
        
        return num - 1;
    }
}