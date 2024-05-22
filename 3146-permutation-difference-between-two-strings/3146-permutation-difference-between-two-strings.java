class Solution {
    public int findPermutationDifference(String s, String t) {
        int answer = 0;
        
        int[] arrS = new int[26];
        int[] arrT = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            arrS[s.charAt(i) - 'a'] = i + 1;
            arrT[t.charAt(i) - 'a'] = i + 1;
        }
        
        for (int i = 0; i < arrS.length; i++) {
            if (arrS[i] == 0) continue;
            answer += Math.abs(arrS[i] - arrT[i]);
        }
        
        return answer;
    }
}