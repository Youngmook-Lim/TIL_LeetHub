class Solution {
    public int minLength(String s) {
        StringBuilder sb;
        String str = s;
        boolean flag = true;
        while (flag) {
            flag = false;
            sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (i < str.length() - 1) {
                    if (c == 'A' && str.charAt(i + 1) == 'B' || c == 'C' && str.charAt(i + 1) == 'D') {
                        i++;
                        flag = true;
                        continue;
                    }
                }
                sb.append(c);
            }
            str = sb.toString();
        }
        return str.length();
    }
}