import java.util.*;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                char temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}