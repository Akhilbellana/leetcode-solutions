                    nums[curr]=nums[i];
                    int temp2=nums[curr];
                if(nums[curr]==0){
                j--;
                nums[j]=temp1;
                nums[curr]=nums[j];
                int temp1=nums[curr];
            if(nums[curr]==2){
                    nums[i]=temp2;
                    i++;
                }
            }else if(nums[curr]==0){
                int temp3=nums[curr];
                nums[curr]=nums[i];
                nums[i]=temp3;
                   curr++;
