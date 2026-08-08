class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product1=1;
        int product2=1;
        product1=nums[0]*nums[1]*nums[nums.length-1];
        product2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        if(product1>product2){
            return product1;
        }else{
            return product2;
        }
    }
}