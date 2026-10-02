class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=nums[0];
        int currmax=nums[0];
        int minsum=nums[0];
        int currmin=nums[0];

        for(int i=1;i<nums.length;i++){
            currmax=Math.max(nums[i],currmax+nums[i]);
            maxsum=Math.max(maxsum,currmax);
            currmin=Math.min(nums[i],currmin+nums[i]);
            minsum=Math.min(currmin,minsum);
        }
        return Math.max(maxsum,Math.abs(minsum));

    }
}