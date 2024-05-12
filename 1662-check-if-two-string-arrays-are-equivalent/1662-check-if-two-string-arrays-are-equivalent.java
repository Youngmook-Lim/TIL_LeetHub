class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int idx1 = 0;
        int idx2 = 0;
        int idx11 = 0;
        int idx22 = 0;
        while (idx1 < word1.length && idx2 < word2.length) {

            char cur1 = word1[idx1].charAt(idx11);
            char cur2 = word2[idx2].charAt(idx22);
            
            if (cur1 != cur2) return false;
            
            if (word1[idx1].length() == idx11 + 1) {
                idx1++;
                idx11 = 0;
            } else {
                idx11++;
            }
            if (word2[idx2].length() == idx22 + 1) {
                idx2++;
                idx22 = 0;
            } else {
                idx22++;
            }
        }
        
        return idx1 == word1.length && idx2 == word2.length;
        
    }
}