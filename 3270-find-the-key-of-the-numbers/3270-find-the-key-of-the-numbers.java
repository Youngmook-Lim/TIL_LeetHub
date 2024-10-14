class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int sum = 0;
        int pow = 0;
        
        for (int i = 0; i < 4; i++) {
            int min = 10;
            min = Math.min(min, num1 % 10);
            min = Math.min(min, num2 % 10);
            min = Math.min(min, num3 % 10);
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            sum += (int) min * Math.pow(10, pow++);
        }
        
        return sum;
    }
}