class Solution:
    def splitNum(self, num: int) -> int:
        num1 = 0
        num2 = 0
        toggle = 1
        arr = [0 for _ in range(10)]
        
        while (num > 0):
            arr[int(num % 10)] += 1
            num /= 10

        for i in range(10):
            while (arr[i] > 0):
                if toggle == 1:
                    num1 *= 10
                    num1 += i
                else:
                    num2 *= 10
                    num2 += i
                arr[i] -= 1
                toggle *= -1

        return num1 + num2
            