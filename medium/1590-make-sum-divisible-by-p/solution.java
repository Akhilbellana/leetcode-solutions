       for(int n:nums){
        tot+=n;
       }
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
       }
       int target=tot%p;
       int sum=0;
           if(map.containsKey(sum-target)){
            min=Math.min(min,i-map.get(sum-target));
           }
           map.put(sum,i);
       if(valid){
        return min;
       }
       return -1;
            valid=true;
       boolean valid=false;
       int tot=0;
       map.put(0,-1);
       Map<Integer,Integer>map=new HashMap<>();
    public int minSubarray(int[] nums, int p) {
class Solution {
       int min=Integer.MAX_VALUE;
