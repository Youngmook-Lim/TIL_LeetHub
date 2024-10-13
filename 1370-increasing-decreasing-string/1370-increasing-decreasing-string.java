class Solution {
    public String sortString(String s) {
        int[] arr = new int[26];
        List<Integer> list = new ArrayList<>();
        
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
            if (arr[c - 'a'] == 1) {
                list.add(c - 'a');
            }
        }
        
        Collections.sort(list);
        
        boolean flag = true;
        boolean toggle = false;
        StringBuilder sb = new StringBuilder();
        
        while (flag) {
            
            flag = false;
            for (int i = 0; i < list.size(); i++) {
                int idx = toggle ? list.get(list.size() - 1 - i) : list.get(i);
                if (idx == -1) continue;
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