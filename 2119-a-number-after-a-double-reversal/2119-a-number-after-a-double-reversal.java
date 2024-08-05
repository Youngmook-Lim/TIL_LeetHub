import java.util.*;

class Solution {
    public boolean isSameAfterReversals(int num) {
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        String orgStr = sb.toString();
        sb.reverse();
        String newStr = sb.toString();
        String tmp = Integer.toString(Integer.parseInt(sb.toString()));
        String newOrgStr = new StringBuilder(tmp).reverse().toString();
        return orgStr.equals(newOrgStr);
    }
}