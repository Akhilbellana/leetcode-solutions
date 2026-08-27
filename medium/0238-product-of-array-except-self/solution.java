class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }
        return prefix;
        for(int i=nums.length-1;i>=0;i--){
        
        prefix[0]=nums[0];
            prefix[i]=prefix[i]*right;
        }
    }
        int right=1;
            right=right*nums[i];
}
