import java.util.*;

class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == 0 ? true : num % 10 != 0;
    }
}