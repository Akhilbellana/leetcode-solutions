        int j=0;
        while(j<nums.length){
           map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        }
           while(map.get(nums[j])>k){
            map.put(nums[i],map.get(nums[i])-1);
           }
            if(map.get(nums[i])==0){
                map.remove(nums[i]);
            }
            i++;
           len=Math.max(len,j-i+1);
        int len=0;
           j++;
        int i=0;
        Map<Integer,Integer>map=new HashMap<>();
    public int maxSubarrayLength(int[] nums, int k) {
class Solution {
