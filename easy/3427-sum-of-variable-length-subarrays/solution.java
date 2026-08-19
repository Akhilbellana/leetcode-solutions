class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        int[] prefix=new int[nums.length+1];
        prefix[0]=0;
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int start=Math.max(0,i-nums[i]);
            sum+=prefix[i+1]-prefix[start];
        }
        return sum;
    }
}