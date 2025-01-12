class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr = new int[s.length()];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                list.add(i);
            }
        }
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = idx == list.size() ? Integer.MAX_VALUE : list.get(idx);
            int b = idx == 0 ? Integer.MAX_VALUE : list.get(idx - 1);
            arr[i] = Math.min(Math.abs(a - i), Math.abs(b - i));
            if (s.charAt(i) == c) {
                idx++;
            }
        }
        return arr;
    }
}