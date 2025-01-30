class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        cnt: int = 0
        remainder: int = 0
        while numBottles > 0:
            cnt += numBottles
            remainder += numBottles % numExchange
            numBottles //= numExchange
            if remainder >= numExchange:
                numBottles += remainder // numExchange
                remainder -= (remainder // numExchange) * numExchange
            
        return cnt