class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix=new int[nums.length+1];
        prefix[0]=0;
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
            for(int i=0;i<nums.length;i++){
            int left=prefix[i];
            int right=prefix[nums.length]-prefix[i+1];
          if(left==right){
            return i;
          }
        }
        return -1;
        
    }
}
