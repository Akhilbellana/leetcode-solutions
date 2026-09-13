class Solution {
    public int minimumSwaps(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<j){
            if(nums[j]==0){
                j--;
            }else if(nums[j]!=0 && nums[i]==0){
                count++;
                j--;
                i++;
            }else{
                i++;
            }
        }
        return count;
    }
}