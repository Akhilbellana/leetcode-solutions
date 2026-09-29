class Solution {
    public int maxScore(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int lsum=0;
        for(int i=0;i<k;i++){
            lsum+=nums[i];
        }
        int maxsum=lsum;
        int rsum=0;
        int last=nums.length-1;
        for(int j=k-1;j>=0;j--){
            lsum-=nums[j];
            rsum+=nums[last];
            last--;
            maxsum=Math.max(maxsum,rsum+lsum);
        }

        return maxsum;
        
    }
}