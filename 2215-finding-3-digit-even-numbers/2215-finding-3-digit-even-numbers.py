class Solution:
    def findEvenNumbers(self, digits: List[int]) -> List[int]:
        arr = []

        for i in range(100, 1000, 2):
            counter = Counter(digits)
            n = i

            flag = True
            while n > 0:
                d = n % 10
                if counter[d] is None or counter[d] == 0:
                    flag = False
                    break
                counter[d] -= 1
                n //= 10
            
            if flag:        
                arr.append(i)
        
        return arr