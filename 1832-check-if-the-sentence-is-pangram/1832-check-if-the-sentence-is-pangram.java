class Solution {
    public boolean checkIfPangram(String sentence) {
        int cnt = 0;
        for (char c : sentence.toCharArray()) {
            int idx = c - 'a';
            cnt |= (1 << idx);
        }
        return cnt == (1 << 26) - 1;
    }
}