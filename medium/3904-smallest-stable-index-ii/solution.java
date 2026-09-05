class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] min=new int[nums.length];
        int maxval=0;
        int minval=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            minval=Math.min(minval,nums[i]);
            min[i]=minval;
        }
        for(int i=0;i<nums.length;i++){
            maxval=Math.max(maxval,nums[i]);
            if(maxval-min[i]<=k){
                return i;
            }
        }
        return -1;
        
    }
}