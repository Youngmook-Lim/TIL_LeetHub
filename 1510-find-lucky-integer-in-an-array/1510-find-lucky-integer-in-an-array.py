class Solution:
    def findLucky(self, arr: List[int]) -> int:
        counter = Counter(arr)

        lucky_numbers = [num for num in counter if num == counter[num]]
        
        if not lucky_numbers:
            return -1
        else:
            return max(lucky_numbers)