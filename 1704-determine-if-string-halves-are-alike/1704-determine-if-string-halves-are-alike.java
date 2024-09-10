class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        int front = 0;
        int back = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i < s.length() / 2) {
                if (set.contains(c)) front++;
            } else {
                if (set.contains(c)) back++;
            }
        }
        
        return front == back;
        
    }
}