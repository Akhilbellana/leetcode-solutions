class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        int[] prefix=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            int start=Math.max(0,i-nums[i]);
        }
        return sum;
            sum+=prefix[i]-prefix[start];
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
    }
        prefix[0]=0;
}
