class Solution {
    public void rotate(int[] nums, int k) {
       int[]a=new int[nums.length];
       k=k%nums.length;
       for(int j=0;j<nums.length;j++){
        int i=(j+k)%nums.length;
        a[i]=nums[j];
       }
       for(int i=0;i<nums.length;i++){
        nums[i]=a[i];
       } 
    }
}