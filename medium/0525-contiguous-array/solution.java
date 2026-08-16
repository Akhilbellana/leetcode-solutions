class Solution {
    public int findMaxLength(int[] nums) {
      Map<Integer,Integer>map=new HashMap<>();
      int max=0;
      int sum=0;
      map.put(0,-1);
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(map.containsKey(sum-i)){
            max=Math.max(max,i-map.get(sum-i));
        }
        if(!map.containsKey(sum-i)){
            map.put(sum,i);
        }
      }
      return max;
      
    }
}