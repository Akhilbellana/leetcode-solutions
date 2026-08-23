class Solution {
    public int minSubarray(int[] nums, int p) {
       Map<Integer,Integer>map=new HashMap<>();
       map.put(0,-1);
       int tot=0;
       for(int n:nums){
        tot+=n;
       }
       int target=tot%p;
       if(target==0){
        return 0;
       }
       int sum=0;
       boolean valid=false;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           int req=(sum%p-target+p)%p;
           if(map.containsKey(req)){
            min=Math.min(min,i-map.get(req));
            valid=true;
           }
           map.put(sum%p,i);
       }
       if(valid){
        return min;
       }
       return -1;
    }
}