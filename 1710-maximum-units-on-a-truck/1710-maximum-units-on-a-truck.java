class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
        int total = 0;
        int idx = 0;
        
        while (idx < boxTypes.length) {
            if (boxTypes[idx][0] < truckSize) {
                total += boxTypes[idx][0] * boxTypes[idx][1];
                truckSize -= boxTypes[idx][0];
                boxTypes[idx][0] = 0;
            } else {
                total += truckSize * boxTypes[idx][1];
                break;
            }
            
            if (boxTypes[idx][0] == 0) {
                idx++;
            }
        }
        
        return total;
        
    }
}