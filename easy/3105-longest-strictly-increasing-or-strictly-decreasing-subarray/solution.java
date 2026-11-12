class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] <= nums[j - 1]) {
                i = j;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        i = 0;
        j = 1;
        while (j < nums.length) {
            if (nums[j] >= nums[j - 1]) {
                i = j;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;

    }
}