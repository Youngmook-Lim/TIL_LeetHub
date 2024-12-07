class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int n = lowLimit; n <= highLimit; n++) {
            putBall(map, n);
        }
        
        return countMaxBall(map);
    }
    
    public void putBall(Map<Integer, Integer> map, int n) {
        int total = 0;
        while (n > 0) {
            total += n % 10;
            n /= 10;
        }
        map.put(total, map.getOrDefault(total, 0) + 1);
    }
    
    public int countMaxBall(Map<Integer, Integer> map) {
        int max = 0;
        for (Integer n : map.keySet()) {
            max = Math.max(max, map.get(n));
        }
        return max;
    }
}