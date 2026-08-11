class Solution {
    public int missingInteger(int[] nums) {
      Set<Integer>set=new HashSet<>();
      int i=0;
      int j=1;
      boolean valid=true;
      int sum=nums[0];
      set.add(nums[0]);
      while(j<nums.length){
        set.add(nums[j]);
        if(nums[j]==nums[j-1]+1 && valid){
            sum+=nums[j];
            i=sum;
        }else{
            valid=false;
        }
        j++;
      }
      while(set.contains(i)){
        i++;
      }
      return i; 
    }
}