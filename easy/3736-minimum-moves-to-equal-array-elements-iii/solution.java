class Solution {
    public int minMoves(int[] nums) {
        int maxval=Integer.MIN_VALUE;
        int sum=0;
        for(int n:nums){
            maxval=Math.max(maxval,n);
            sum+=n;
        }
        return nums.length*maxval-sum;
        
    }
}