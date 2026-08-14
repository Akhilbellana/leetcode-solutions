class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
          if(lsum==rsum){
        }
        
            int lsum=0;
            for(int j=0;j<=i;j++){
                lsum+=nums[j];
            }
            int rsum=0;
            for(int k=i+1;k<nums.length;k++){
                rsum+=nums[k];
            } 
            return i;
          }
    }
        return -1;
}
