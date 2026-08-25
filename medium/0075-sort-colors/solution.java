                nums[curr]=nums[j];
                int temp1=nums[curr];
            if(nums[curr]==2){
        while(curr<j){
        int j=nums.length-1;
        int curr=0;
                nums[j]=temp1;
                j--;
                if(nums[curr]==0){
                    int temp2=nums[curr];
                    nums[curr]=nums[i];
                    nums[i]=temp2;
                    i++;
                    curr++;
                }
            }else if(nums[curr]==0){
                int temp3=nums[curr];
                nums[curr]=nums[i];
                nums[i]=temp3;
                i++;
                curr++;
            }else{
                curr++;
            }
        }
        
    }
}
        int i=0;
    public void sortColors(int[] nums) {
