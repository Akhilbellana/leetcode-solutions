class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd=0;
        int count=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[i]%2!=0){
                    odd--;
                }
                i++;
            }
            if(odd==k){
                int temp=i;
                int even=0;
                while(nums[temp]%2==0){
                    even++;
                    temp++;
                }
                count+=even+1;
            }
            j++;
        }
        return count;

        
    }
}