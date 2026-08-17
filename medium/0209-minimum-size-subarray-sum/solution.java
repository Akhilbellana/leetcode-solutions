class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        boolean valid = false;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    valid = true;
                    min = Math.min(min, j - i + 1);
                }

            }
        }
        if (valid) {
            return min;
        }
        return 0;
    }
}