class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        boolean valid = false;
        int min = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j];
            while (sum >= target) {
                sum = sum - nums[i];
                i++;
            }
                min = Math.min(min, j - i + 1);
                valid = true;
