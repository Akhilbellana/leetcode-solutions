class Solution {
    public int findMaxLength(int[] nums) {
        int max=0;
      for(int i=0;i<nums.length;i++){
        int z=0;
        int o=0;
        for(int j=i;j<nums.length;j++){
            if(nums[j]==0){
                z++;
            }else{
                o++;
            }
            if(z==o){
                max=Math.max(max,j-i+1);
            }
        }
      }
      return max;  
    }
}