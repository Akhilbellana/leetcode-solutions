class Solution {
    public int findMaxLength(int[] nums) {
      Map<Integer,Integer>map=new HashMap<>();
      int max=0;
      int sum=0;
      map.put(0,-1);
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(map.containsKey(i-sum)){
            max=Math.max(max,i-map.get(i-sum));
        }
        if(!map.containsKey(i-sum)){
            map.put(sum,i);
        }
      }
      return max;
      
    }
}