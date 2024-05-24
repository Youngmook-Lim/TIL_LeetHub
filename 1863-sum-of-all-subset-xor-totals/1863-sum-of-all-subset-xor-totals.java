import java.util.*;

class Solution {
    
    List<Integer> list = new ArrayList<>();
    int total = 0;
    
    public int subsetXORSum(int[] nums) {
        
        dfs(nums, 0);  
        
        return total;
        
    }
    
    public void dfs(int[] nums, int idx) {
        
        if (list.size() > nums.length) return;
        
        total += calc(nums);
        
        for (int i = idx; i < nums.length; i++) {
            list.add(i);
            dfs(nums, i + 1);
            list.remove(list.size() - 1);
        }
        
    }
    
    public int calc(int[] nums) {
        
        int n = list.size();
        
        if (n == 0) return 0;
        
        int ret = nums[list.get(0)];
        
        for (int i = 1; i < n; i++) {
            ret ^= nums[list.get(i)];
        }
        
        return ret;
        
    }
    
}