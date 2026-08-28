class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        boolean valid = false;
        int min = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j];
            while (sum >= target) {
                min = Math.min(min, j - i + 1);
                valid = true;
                sum = sum - nums[i];
                i++;
            }
            j++;
        }
        if (valid) {
            return min;
        }
        return 0;
    }
}