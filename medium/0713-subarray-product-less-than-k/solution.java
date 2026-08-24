class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                prod=prod*nums[j];
            }
        }
        
            int prod=1;
                if(prod<k){
                    count+=j-i+1;
                }
    }
        int count=0;
        return count;
}
