class Solution {
    public int maxProduct(int[] nums) {
        int maxprod = nums[0];
        int currmax = nums[0];
        int currmin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int oldmax=currmax;
            int oldmin=currmin;
            currmax = Math.max(nums[i],
                    Math.max(oldmax * nums[i], oldmin * nums[i]));

            currmin = Math.min(nums[i],
                    Math.min(oldmax * nums[i], oldmin * nums[i]));
            maxprod=Math.max(maxprod,currmax);
        }
        return maxprod;

    }
}