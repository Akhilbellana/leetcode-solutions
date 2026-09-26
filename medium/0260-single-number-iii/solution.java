class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int[]ans=new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=2){
                ans[j]=nums[i];
                j++;
            }
        }
        return ans;

        
    }
}