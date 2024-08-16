import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        } 
        for (int x : nums2) {
            set2.add(x);
        }
        
        List<Integer> res1 = Arrays.stream(nums1)
            .filter(v -> {
                if (set2.contains(v)) {
                    return false;
                } else {
                    set2.add(v);
                    return true;                    
                }
            })
            .boxed()
            .collect(Collectors.toList());
        List<Integer> res2 = Arrays.stream(nums2)
            .filter(v -> {
                if (set1.contains(v)) {
                    return false;
                } else {
                    set1.add(v);
                    return true;                    
                }
            })
            .boxed()
            .collect(Collectors.toList());
        
        List<List<Integer>> list = new ArrayList<>();
        list.add(res1);
        list.add(res2);
        
        return list;
    }
}