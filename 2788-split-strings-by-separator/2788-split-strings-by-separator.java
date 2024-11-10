class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for (String s : words) {         
            String[] tmp = s.split("[" + separator + "]");
            for (String str : tmp) {
                if (str.length() > 0) {
                    list.add(str);
                }
            }
        }
        return list;
    }
}