class Solution {
    public int minimumSwaps(int[] nums) {
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=0){
                count++;
            }
        }
        return count;

    }
        int count=0;
}
