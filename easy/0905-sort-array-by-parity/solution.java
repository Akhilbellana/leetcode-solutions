class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even=0;
        int[]a=new int[nums.length];
        for(int x:nums){
            if(x%2==0){
                even++;
            }
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 &&j<even){
                a[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                a[j]=nums[i];
                j++;
            }
        }
        return a;

        
    }
}