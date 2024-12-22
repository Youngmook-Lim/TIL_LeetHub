class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = nums.length - 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int n1 = (int) Math.pow(nums[i], 2);
            int n2 = (int) Math.pow(nums[i + 1], 2);
            if (n2 > n1) {
                start = i;
                break;
            }
        }
        
        int front = start;
        int back = start + 1;
        int idx = 0;
        int[] arr = new int[nums.length];
        
        while (front >= 0 && back < nums.length) {
            int n1 = (int) Math.pow(nums[front], 2);
            int n2 = (int) Math.pow(nums[back], 2);
            
            if (n1 < n2) {
                arr[idx++] = n1;
                front--;
            } else {
                arr[idx++] = n2;
                back++;
            }
        }
        
        while (front >= 0) {
            int n = (int) Math.pow(nums[front], 2);
            arr[idx++] = n;
            front--;
        }
        while (back < nums.length) {
            int n = (int) Math.pow(nums[back], 2);
            arr[idx++] = n;
            back++;
        }
        
        return arr;
        
    }
}