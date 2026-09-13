class Solution {
    public int minimumSwaps(int[] nums) {
        int zeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
        }
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                count++;
                zeros--;
            } else {
                zeros--;
            }
            if (zeros == 0) {
                return count;
            }
        }
        return 0;

    }
}