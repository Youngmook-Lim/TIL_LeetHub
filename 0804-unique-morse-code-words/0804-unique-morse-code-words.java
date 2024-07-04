class Solution {
    
    public String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String x : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : x.toCharArray()) {
                sb.append(morse[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}