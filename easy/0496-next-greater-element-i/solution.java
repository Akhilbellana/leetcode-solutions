class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(j+1<nums2.length&& nums2[j+1]>nums1[i] ){
                        list.add(nums2[j+1]);
                    }else{
                        list.add(-1);
                    }
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