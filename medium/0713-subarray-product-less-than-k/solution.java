class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        long prod=1;
        int count=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            prod*=nums[j];
            while(prod>=k){
                prod=prod/nums[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;

        
    }
}