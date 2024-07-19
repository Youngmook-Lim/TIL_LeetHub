class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int cnt = 0;
        for (String x : words) {
            if (set.contains(x)) {
                set.remove(x);
                cnt++;
            } else {
                String r = new StringBuilder(x).reverse().toString();
                set.add(r);
            }
        }
        return cnt;
    }
}