class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");

        while (true) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
                sb2.append((char) (c + 1));
            }
            sb.append(sb2);
            if (sb.length() >= k) break;;
        }

        return sb.charAt(k - 1);
    }
}