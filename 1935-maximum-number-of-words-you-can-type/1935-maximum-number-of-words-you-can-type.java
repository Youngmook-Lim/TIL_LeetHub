class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            set.add(c);
        }
        
        String[] arr = text.split(" ");
        int cnt = 0;
        for (String s : arr) {
            boolean flag = false;
            for (char c : s.toCharArray()) {
                if (set.contains(c)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) cnt++;
        }
        
        return cnt;
    }
}