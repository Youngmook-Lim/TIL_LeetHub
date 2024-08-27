class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int[] arr = new int[100001];
        for (int i = 0; i < heights.length; i++) {
            arr[heights[i]] = i;
        }
        Arrays.sort(heights);
        String[] ret = new String[names.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            ret[heights.length - 1 - i] = names[arr[heights[i]]];
        }
        return ret;
    }
}