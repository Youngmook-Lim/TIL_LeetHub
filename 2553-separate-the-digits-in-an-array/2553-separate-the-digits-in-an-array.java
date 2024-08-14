class Solution {
    public int[] separateDigits(int[] nums) {
        return Arrays.stream(nums)
            .mapToObj(Integer::toString)
            .flatMapToInt(str -> str.chars().map(c -> c - '0'))
            .toArray();
    }
}