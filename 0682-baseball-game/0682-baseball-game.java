class Solution {
    public int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int idx = 0;
        int sum = 0;
        
        for (int i = 0; i < operations.length; i++) {
            String cmd = operations[i];
            if (cmd.equals("+")) {
                scores[idx] = scores[idx - 1] + scores[idx - 2];
                idx++;
            } else if (cmd.equals("D")) {
                scores[idx] = 2 * scores[idx - 1];
                idx++;
            } else if (cmd.equals("C")) {
                scores[idx--] = 0;
            } else {
                scores[idx++] = Integer.parseInt(cmd);
            }
        }
        
        for (int i = 0; i < idx; i++) {
            sum += scores[i];
        }
        return sum;
    }
}