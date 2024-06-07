import java.util.*;

class Solution {
    public List<String> cellsInRange(String s) {

        char startCol = s.charAt(0);
        char startRow = s.charAt(1);
        char endCol = s.charAt(3);
        char endRow = s.charAt(4);
        
        List<String> list = new ArrayList<>();
        
        for (char i = startCol; i <= endCol; i++) {
            for (char j = startRow; j <= endRow; j++) {
                list.add(new String(new char[]{i, j}));
            }
        }
        
        return list;
    }
}