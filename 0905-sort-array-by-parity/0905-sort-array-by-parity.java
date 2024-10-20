class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int front = 0;
        int back = nums.length - 1;
        int[] arr = new int[nums.length];
        
        for (int n : nums) {
            if (n % 2 == 0) {
                arr[front++] = n;
            } else {
                arr[back--] = n;
            }
        }
        return arr;
    }
}