class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean valid=false;
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            while(j<nums.length){
                if(j-i<=k){
                    if(nums[i]==nums[j]){
                        valid=true;
                        return true;
                    
                }
            }else{
                break;
            }
            j++;
            
        }
        
    }
    return false;
}
}
