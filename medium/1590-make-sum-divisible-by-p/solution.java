class Solution {
    public int minSubarray(int[] nums, int p) {
       Map<Integer,Integer>map=new HashMap<>();
       map.put(0,-1);
       long tot=0;
       for(int n:nums){
        tot+=n;
       }
       int target=(int)(tot%p);
       if(target==0){
        return 0;
       }
       int min=Integer.MAX_VALUE;
       long sum=0;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           int req=(sum%p-target+p)%p;
           if(map.containsKey(req)){
            min=Math.min(min,i-map.get(req));
           }
           map.put(sum%p,i);
       }
       if(min==Integer.MAX_VALUE || min==nums.length){
        return -1;
       }else{
        return min;
       }
    }
}