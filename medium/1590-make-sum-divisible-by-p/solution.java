class Solution {
    public int minSubarray(int[] nums, int p) {
       Map<Integer,Integer>map=new HashMap<>();
       map.put(0,1);
       int sum=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       } 
        if(map.containsKey(sum%p)){
            min=Math.min(min,i-map.get(sum%p));
        }else{
       int min=Integer.MAX_VALUE;
        map.put(sum%p,map.getOrDefault(sum%p,0)+1);
            map.put(sum%p,i);
        }
            valid=true;
       boolean valid=false;
       if(valid){
        return min;
    }
       }
       return -1;
}
