class Solution {
    public List<String> commonChars(String[] words) {
        int[][] graph = new int[words.length][26];
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                graph[i][c - 'a']++;
            }
        }
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            int cnt = Integer.MAX_VALUE;
            for (int j = 0; j < words.length; j++) {
                cnt = Math.min(cnt, graph[j][i]);
            }
            for (int j = 0; j < cnt; j++) {
                list.add(Character.toString((char) (i + 'a')));
            }
        }
        return list;
    }
}