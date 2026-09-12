class Solution {
    public int maximumStrongPairXor(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j<=i+1;j++){

            }
        }
        
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    val=Math.max(val,nums[i]^nums[j]);
                }
    }
        return val;
        int val=0;
}
