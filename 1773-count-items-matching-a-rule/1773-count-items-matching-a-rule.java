class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = -1;
        switch(ruleKey) {
            case "type":
                idx = 0;
                break;
            case "color":
                idx = 1;
                break;
            case "name":
                idx = 2;
        }
        
        int ans = 0;
        for (List<String> list : items) {
            if (list.get(idx).equals(ruleValue)) ans++;
        }
        
        return ans;
    }
}