class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int i1 = 0;
        int i2 = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] <= nums[j - 1]) {
                i1 = j;
            }
            if (nums[j] >= nums[j - 1]) {
                i2 = j;
            }
            max = Math.max(max, j - i2 + 1);
            max = Math.max(max, j - i1 + 1);
            j++;
        }
        return max;

    }
}