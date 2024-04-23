import java.util.*;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ll = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            ll.add(index[i], nums[i]);
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = ll.get(i);
        }
        return answer;
     }
}