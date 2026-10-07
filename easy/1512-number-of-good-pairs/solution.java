class Solution {
    public int numIdenticalPairs(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                count += map.get(nums[i]);
            }
            set.add(nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return count;

    }
}