class Solution:
    def countPrimeSetBits(self, left: int, right: int) -> int:
        cnt = 0
        arr = setup_prime_array(right)
        for n in range(left, right + 1):
            set_bits = count_set_bits(n)
            if arr[set_bits] == 0:
                cnt += 1
        
        return cnt

def setup_prime_array(m):
    n = len(bin(m)[2:])
    arr = [0 for _ in range(n + 1)]
    arr[1] = 1
    for i in range(2, int(math.sqrt(n)) + 1):
        if arr[i] == 0:
            for j in range(i * 2, n + 1, i):
                arr[j] = 1
    return arr

def count_set_bits(n):
    cnt = 0
    idx = 1
    while idx <= n:
        if n & idx > 0:
            cnt += 1
        idx <<= 1
    return cnt

    
