class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos = 0;
        for (String cmd : commands) {
            if (cmd.equals("UP")) {
                pos -= n;
            } else if (cmd.equals("RIGHT")) {
                pos++;
            } else if (cmd.equals("DOWN")) {
                pos += n;
            } else {
                pos--;
            }
        }
        return pos;
    }
}