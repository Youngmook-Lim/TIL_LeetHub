class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] arr : image) {
            flip(arr);
        }
        invert(image);
        return image;
    }
    
    public void invert(int[][] graph) {
        for (int[] arr : graph) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] == 0 ? 1 : 0;
            }
        }
    }
    
    public void flip(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
    } 
}