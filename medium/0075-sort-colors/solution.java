                    curr++;
                }
            }else if(nums[curr]==0){
                int temp3=nums[curr];
                nums[curr]=nums[i];
                nums[i]=temp3;
                i++;
            }else{
                curr++;
            }
        }
        
    }
                curr++;
}
