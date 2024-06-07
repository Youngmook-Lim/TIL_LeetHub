import java.util.*;

class Solution {
    public List<String> cellsInRange(String s) {
        String[] tmp = s.split(":");
        char startCol = tmp[0].charAt(0);
        char startRow = tmp[0].charAt(1);
        char endCol = tmp[1].charAt(0);
        char endRow = tmp[1].charAt(1);
        
        List<String> list = new ArrayList<>();
        
        for (char i = startCol; i <= endCol; i++) {
            for (char j = startRow; j <= endRow; j++) {
                list.add(Character.toString(i) + Character.toString(j));
            }
        }
        
        return list;
    }
}