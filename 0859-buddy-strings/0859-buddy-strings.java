class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        
        int n = s.length();
        List<Character> sChars = new ArrayList<>();
        List<Character> goalChars = new ArrayList<>();
        int[] alphabet = new int[26];
        
        int cnt = 0;
        boolean flag = false;
        
        for (int i = 0; i < n; i++) {
            alphabet[s.charAt(i) - 'a']++;
            if (alphabet[s.charAt(i) - 'a'] == 2) {
                flag = true;
            }
            
            if (s.charAt(i) != goal.charAt(i)) {
                cnt++;
                sChars.add(s.charAt(i));
                goalChars.add(goal.charAt(i));
            }
            if (cnt > 2) return false;
        }
        
        if (cnt == 0) return flag == true;
        if (cnt == 1) return false;
        
        if (sChars.get(0) == goalChars.get(1) && sChars.get(1) == goalChars.get(0)) return true;
        
        return false;
    }
}