class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : nums) {
            if (map.get(n) == 1 && n % 2 == 0) {
                return n;
            }
        }
        return -1;

    }
}