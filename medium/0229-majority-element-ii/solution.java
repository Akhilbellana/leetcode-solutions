class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])>n/3){
                    if(!list.contains(nums[i])){
                        list.add(nums[i]);
                    }
                }
            }

        }
        return list;
    }
}