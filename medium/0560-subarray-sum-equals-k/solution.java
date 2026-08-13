class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int len=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                int prev=map.get(sum-k);
                len=Math.max(len,i-prev);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        
 
        }
        return len;
    }
}