class Solution {
    public int countCompleteDayPairs(int[] hours) {
        return IntStream.range(0, hours.length - 1)
                        .map(i -> (int) IntStream.range(i + 1, hours.length)
                                                 .filter(j -> (hours[i] + hours[j]) % 24 == 0)
                                                 .count())
                        .sum();
    }
}