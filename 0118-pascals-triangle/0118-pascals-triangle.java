class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    tmp.add(1);
                } else {
                    if (i > 0) {
                        List<Integer> prev = tri.get(i - 1);
                        tmp.add(prev.get(j - 1) + prev.get(j));
                    }
                }
            }
            tri.add(tmp);
        }
        return tri;
    }
}