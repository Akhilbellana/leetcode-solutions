class Solution {
    public int maxProduct(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
                product=product*nums[j];
            }
        }
        
    }
                max=Math.max(max,product);
        return max;
        int max=0;
}
