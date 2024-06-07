import java.util.*;

class Solution {
    public List<String> cellsInRange(String s) {
        String[] tmp = s.split(":");
        char startCol = tmp[0].charAt(0);
        int startRow = tmp[0].charAt(1) - '0';
        char endCol = tmp[1].charAt(0);
        int endRow = tmp[1].charAt(1) - '0';
        
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i <= endCol - startCol; i++) {
            for (int j = startRow; j <= endRow; j++) {
                String cell = (char) (startCol + i) + Integer.toString(j);
                list.add(cell);
            }
        }
        
        return list;
    }
}