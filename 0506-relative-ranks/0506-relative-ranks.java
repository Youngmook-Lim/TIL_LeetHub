class Solution {
    public String[] findRelativeRanks(int[] score) {
        int max = 0;
        for (int n : score) {
            max = Math.max(max, n);
        }

        int[] map = new int[max + 1];
        for (int i = 0; i < score.length; i++) {
            map[score[i]] = i + 1;
        }

        String[] arr = new String[score.length];
        int rank = 1;
        
        for (int i = max; i >= 0; i--) {

            if (map[i] == 0) continue;
            String val;
            switch(rank) {
                case 1:
                    val = "Gold Medal";
                    break;
                case 2:
                    val = "Silver Medal";
                    break;
                case 3:
                    val = "Bronze Medal";
                    break;
                default:
                    val = Integer.toString(rank);
            }
            arr[map[i] - 1] = val;
            rank++;
        }

        return arr;
    }
}