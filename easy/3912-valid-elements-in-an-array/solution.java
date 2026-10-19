class Solution {
    public List<Integer> findValidElements(int[] nums) {
        if (nums.length <= 1) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            return list;
        }
        int[] sufmax = new int[nums.length];
        sufmax[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            sufmax[i] = Math.max(sufmax[i + 1], nums[i]);
        }
        int premax = nums[0];
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > premax || nums[i] > sufmax[i + 1]) {
                list.add(nums[i]);
            }
            premax = Math.max(premax, nums[i]);
        }
        list.add(nums[nums.length - 1]);
        return list;
    }
}