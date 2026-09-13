class Solution {
    public int minimumSwaps(int[] nums) {
        int zeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
            }
        }
        if(zeros==0){
            return 0;
    }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros--;
            }
            if(zeros==0){
                return nums.length-i-1;
            }
        }
        return 0;

    }
}