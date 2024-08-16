import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        boolean[] arr1 = new boolean[2001];
        boolean[] arr2 = new boolean[2001];
        
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        
        for (int x : nums1) {
            arr1[x + 1000] = true;
        }
        for (int x : nums2) {
            arr2[x + 1000] = true;
        }
        
        for (int x : nums1) {
            if (arr1[x + 1000] && !arr2[x + 1000]) {
                arr1[x + 1000] = false;
                list.get(0).add(x);
            }
        }
        
        for (int x : nums2) {
            if (arr2[x + 1000] && !arr1[x + 1000]) {
                arr2[x + 1000] = false;
                list.get(1).add(x);
            }
        }
        
        return list;
    }
}