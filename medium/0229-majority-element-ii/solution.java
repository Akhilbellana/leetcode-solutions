        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])>n/3){
            }
                    if(!list.contains(nums[i])){
                }
                        list.add(nums[i]);
                    }

        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
    public List<Integer> majorityElement(int[] nums) {
class Solution {
