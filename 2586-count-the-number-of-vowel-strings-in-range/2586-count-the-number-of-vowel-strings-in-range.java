class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int cnt = 0;
        for (int i = left; i <= right; i++) {
            String s = words[i];
            char start = s.charAt(0);
            char end = s.charAt(s.length() - 1);
            if (start != 'a' && start != 'e' && start != 'i' && start != 'o' && start != 'u') continue;
            if (end != 'a' && end != 'e' && end != 'i' && end != 'o' && end != 'u') continue;
            cnt++;
        }

        return cnt;
    }
}