class Solution {
    public int[] separateDigits(int[] nums) {
        return Arrays.stream(nums)
            .flatMap(n -> Arrays.stream(Integer.toString(n).split(""))
                        .mapToInt(Integer::parseInt))
            .toArray();
    }
}