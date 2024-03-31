class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        
        for (int x : candies) {
            max = Math.max(max, x);
        }
        
        for (int x : candies) {
            list.add(x + extraCandies >= max ? true : false);
        }
        return list;
    }
}