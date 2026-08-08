class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product=1;
        for(int i=nums.length-1;i>=nums.length-3;i--){
            product*=nums[i];
        }
        return product;
    }
}
