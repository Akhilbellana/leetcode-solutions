class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        int[] a = new int[nums.length];
        int left = 0;
        for (int i = 0; i < nums.length; i++) {

            a[i] = Math.abs((total - left - nums[i]) - left);
            left = left + nums[i];
        }
        return a;

    }
}