class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        
        if (s.equals(goal)) {
            int[] alphabet = new int[26];
            for (int i = 0; i < s.length(); i++) {
                alphabet[s.charAt(i) - 'a']++;
                if (alphabet[s.charAt(i) - 'a'] == 2) return true;
            }
            return false;
        }
        
        int n = s.length();
        List<Integer> list = new ArrayList<>();
        
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                cnt++;
                list.add(i);
            }
            if (cnt > 2) return false;
        }
        
        if (cnt == 1) return false;
        
        return cnt == 2 && s.charAt(list.get(0)) == goal.charAt(list.get(1)) && s.charAt(list.get(1)) == goal.charAt(list.get(0));
    }
}