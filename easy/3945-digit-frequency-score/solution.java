class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (n > 0) {
            int digit = n % 10;
            map.put(digit, map.getOrDefault(digit, 0) + 1);
            n = n / 10;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            sum+=value*key;   
        }
        return sum;
    }
}        