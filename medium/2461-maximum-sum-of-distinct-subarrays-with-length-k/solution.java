class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=0;
        int sum=0;
        while(j<nums.length){

            if(set.contains(nums[j])){
                i=j;
                 set.clear();
                 set.add(nums[j]);
                 sum=0;
                 sum+=nums[j];
            }else{
                set.add(nums[j]);
                sum+=nums[j];
            }
            if(set.size()==k){
              max=Math.max(max,sum);
              i++;
            }
            j++;
        }
        return max;
    }
}