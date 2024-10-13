class Solution {
    public String sortString(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        
        boolean flag = true;
        boolean toggle = false;
        StringBuilder sb = new StringBuilder();
        
        while (flag) {
            flag = false;
            for (int i = 0; i < 26; i++) {
                int idx = toggle ? 25 - i : i;
                if (arr[idx] == 0) continue;
                sb.append((char) ('a' + idx));
                arr[idx]--;
                flag = true;
            }
            toggle = toggle ? false : true;
        }
        
        return sb.toString();
    }
}