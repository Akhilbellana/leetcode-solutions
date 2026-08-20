class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        int temp1=nums[0];
        int temp2=nums[1];
        for(int i=2;i<nums.length;i++){
            if(temp1>temp2){
                list1.add(nums[i]);
                temp1=nums[i];
            }else{
                list2.add(nums[i]);
                temp2=nums[i];
            }
        }
        int[] a= new int[nums.length];
        for(int i=0;i<list1.size();i++){
            a[i]=list1.get(i);
        }
        int j=0;
        for(int i=list1.size();i<nums.length;i++){
             a[i]=list2.get(j);
             j++;
        }
       
        return a;
    }
}