class Solution {
    public int subarraySum(int[] nums, int k) {
        int i=0;
        int j=0;
        int count=0;
        int sum=0;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>k){
                sum=sum-nums[i];
                i++;
            }
            if(sum==k){
                count++;
            }
                j++;
           
        }
        return count;
    }
}