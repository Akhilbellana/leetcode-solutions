class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i])+1<=k){
        
    }
    return false;
                 return true;
            }
}
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
}
