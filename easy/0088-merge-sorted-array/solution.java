        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[j];
            }else{
                nums1[i]=nums2[j];
            }
            i--;
            j--;
                k--;
        }

                nums1[k]=nums1[i];
    }
}
