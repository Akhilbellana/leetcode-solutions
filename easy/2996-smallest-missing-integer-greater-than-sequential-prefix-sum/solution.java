class Solution {
    public int missingInteger(int[] nums) {
      Set<Integer>set=new HashSet<>();
      int i=0;
      int j=1;
      int sum=nums[0];
      set.add(nums[0]);
      while(j<nums.length){
        set.add(nums[j]);
        if(nums[j]==nums[j-1]+1){
            sum+=nums[j];
            i=sum;
        } 
        j++;
      }
      while(set.contains(i)){
        i++;
      }
      return i; 
    }
}