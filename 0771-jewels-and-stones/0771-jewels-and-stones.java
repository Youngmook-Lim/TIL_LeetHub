class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int cnt = 0;
        
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) cnt++;
        }
        
        return cnt;
    }
}