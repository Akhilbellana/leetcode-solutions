class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int prefix1=1;
        for(int n:nums){
            if(prefix1==0){
                prefix1=1;
            }
            prefix1*=n;
            max=Math.max(max,prefix1);
        }
        int prefix2=1;
        for(int i=nums.length-1;i>=0;i--){
            if(prefix2==0){
                prefix2=1;
            }
            prefix2*=nums[i];
            max=Math.max(max,prefix2);
        }
        return max;
        
    }
}