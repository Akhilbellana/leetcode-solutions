class Solution {
    public int minMoves(int[] nums) {
        int maxval=0;
        for(int n:nums){
            maxval=Math.max(maxval,n);
        }
        int res=0;
        for(int n:nums){
            res+=Math.abs(maxval-n);
        }
        return res;
        
    }
}