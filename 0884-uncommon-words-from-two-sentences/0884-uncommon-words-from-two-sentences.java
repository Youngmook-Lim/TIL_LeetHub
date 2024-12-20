class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for (String s : s1.split(" ")) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for (String s : s2.split(" ")) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        
        List<String> list = new ArrayList<>();
        
        for (String s : map1.keySet()) {
            if (map1.get(s) == 1) {
                if (!map2.containsKey(s)) {
                    list.add(s);
                }
            }
        }
        for (String s : map2.keySet()) {
            if (map2.get(s) == 1) {
                if (!map1.containsKey(s)) {
                    list.add(s);
                }
            }
        }
        
        String[] ret = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        
        return ret;
    }
}