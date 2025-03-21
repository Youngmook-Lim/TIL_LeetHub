class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        total = 0
        arr = []

        for i in range(len(bank)):
            cnt = bank[i].count('1')
            if cnt > 0:
                arr.append(cnt)

        for i in range(len(arr) - 1):
            total += arr[i] * arr[i + 1]
        
        return total

