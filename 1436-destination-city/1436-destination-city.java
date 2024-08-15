class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        String s = "";
        for (List<String> list : paths) {
            String start = list.get(0);
            String end = list.get(1);
            map.put(start, end);
            s = start;
        }
        
        while (map.get(s) != null) {
            s = map.get(s);
        }
        
        return s;
    }
}