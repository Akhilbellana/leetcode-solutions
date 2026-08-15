class NumArray {
    public NumArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
    }
    
    public int sumRange(int left, int right) {
        return prefix[right]-prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
        }
    int[] prefix;
           prefix[i+1]=prefix[i]+nums[i];
        prefix=new int[nums.length+1];
            prefix[0]=0;
 * int param_1 = obj.sumRange(left,right);
 */
