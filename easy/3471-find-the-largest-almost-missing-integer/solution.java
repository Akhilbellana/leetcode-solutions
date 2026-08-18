class Solution {
    public int largestInteger(int[] nums, int k) {
    int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(set.contains(nums[j])){
            }
        }
                    max=Math.max(max,j-i+1);
                }
    }
            Set<Integer>set=new HashSet<>();
        return max;
                    break;
                set.add(nums[j]);
}
