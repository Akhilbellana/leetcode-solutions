class Solution {
    public int minimumSwaps(int[] nums) {
        int zeros=0;
        int count=0;
        for(int n:nums){
            if(n==0){
                zeros++;
            }
        }
        if(zeros==0){
            return 0;
        }
        for(int i=nums.length-1;i>=nums.length-zeros;i--){
            if(nums[i]!=0){
                count++;
            }
        }
        return count;
    }
}