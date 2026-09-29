class Solution {
    public int findPairs(int[] nums, int k) {
        int i=0;
        int j=1;
        int count=0;
        Set<List<Integer>>set=new HashSet<>();
        Arrays.sort(nums);
        while(j<nums.length){
            if(i==j){
                j++;
                continue;
            }
            if(nums[j]-nums[i]==k && j!=i){
                List<Integer>list=new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                set.add(list);
                i++;
                j++;
            }else if(nums[j]-nums[i]<k){
                j++;
            }else{
                i++;
            }

        }
        return set.size();
        
    }
}