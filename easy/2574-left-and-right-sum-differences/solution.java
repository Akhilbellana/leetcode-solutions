class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] prefix=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }

        
        prefix[0]=0;
        for(int i=0;i<nums.length;i++){
             prefix[i]=Math.abs(prefix[nums.length]-prefix[i+1]-prefix[i]);
        }
    }
        return prefix;
}
