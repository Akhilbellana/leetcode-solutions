class Solution {
    public int minOperations(int[] nums) {
        int i=0;
        int cnt=0;
        while(i<nums.length){
            while(i<nums.length && nums[i]==1){
                i++;
            }
            if(i==nums.length){
                return cnt;
            }
            if(i+2>=nums.length){
                return -1;
            }else{
                int j=i+2;
                for(int k=i;k<=j;k++){
                    nums[k]=nums[k]==0 ? 1 :0;
                }
                cnt++;
            }
            i++;
        }
        return cnt;

    }
}