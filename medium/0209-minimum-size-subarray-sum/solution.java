            int sum = 0;
            for (int j = i; j < nums.length; j++) {

                sum += nums[j];
                if (sum >= target) {
                    min = Math.min(min, j - i + 1);
                }

                    valid = true;
        for (int i = 0; i < nums.length; i++) {
    public int minSubArrayLen(int target, int[] nums) {
class Solution {
        boolean valid = false;
        int min = Integer.MAX_VALUE;
