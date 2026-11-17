class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max = 0;
        int i = 0;
        int j = 0;
        int mask = 0;
        while (j < nums.length) {
            if ((mask & nums[j]) == 0) {
                mask = mask | nums[j];
                max = Math.max(max, j - i + 1);
                j++;
            }
            while (j < nums.length && (mask & nums[j]) != 0) {
                mask = mask ^ nums[i];
                i++;
            }
        }
        return max;
    }
}