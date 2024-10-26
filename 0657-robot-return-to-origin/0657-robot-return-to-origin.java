class Solution {
    public boolean judgeCircle(String moves) {
        int rl = 0;
        int ud = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'R':
                    rl++;
                    break;
                case 'L':
                    rl--;
                    break;
                case 'U':
                    ud++;
                    break;
                case 'D':
                    ud--;
                    break;
            }
        }
        
        return rl == 0 && ud == 0;
    }
}