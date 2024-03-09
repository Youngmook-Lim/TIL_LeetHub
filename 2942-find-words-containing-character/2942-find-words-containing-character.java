import java.util.*;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.contains(Character.toString(x))) {
                list.add(i);
            }
        }
        return list;
    }
}