class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        int[] prefix=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            int start=Math.max(0,i-nums[i]);
        }
        return sum;
        prefix[0]=0;
            sum+=prefix[i+1]-prefix[start+1];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
    }
}
