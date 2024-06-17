class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] isPresent = new boolean[26];
        int cnt = 0;
        for (int i = 0; i < sentence.length(); i++) {
            int idx = sentence.charAt(i) - 'a';
            if (!isPresent[idx]) {
                isPresent[idx] = true;
                cnt++;
            }
        }
        return cnt == 26;
    }
}