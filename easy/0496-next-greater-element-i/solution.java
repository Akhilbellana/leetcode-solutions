class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int k=j+1;
                    while(k<nums2.length){
                        if(nums2[k]>nums1[i]){
                            list.add(nums2[k]);
                            break;
                        }
                        k++;
                    }
                    if(k==nums2.length){
                        list.add(-1);
                    }
                    break;
                }
            }
        }
        int[] a=new int[list.size()];
        for(int i=0;i<list.size();i++){
            a[i]=list.get(i);
        }
        return a;
    }
}