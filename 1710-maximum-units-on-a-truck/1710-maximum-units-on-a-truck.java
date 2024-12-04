class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
        int total = 0;
        int idx = 0;
        
        while (truckSize-- > 0 && idx < boxTypes.length) {
            boxTypes[idx][0]--;
            total += boxTypes[idx][1];
            if (boxTypes[idx][0] == 0) {
                idx++;
            }
        }
        
        return total;
        
    }
}