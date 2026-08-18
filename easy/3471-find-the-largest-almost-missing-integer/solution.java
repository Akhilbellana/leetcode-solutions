        for(int i=0;i<nums.length-k;i++){
            Set<Integer>set=new HashSet<>();
            for(int j=i;j<i+k;j++){
               if(!set.contains(nums[j])){
        }
                set.add(nums[j]);
               }
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
        }
                max=Math.max(max,entry.getKey());
            }
                valid=true;
    int max=0;
    Map<Integer,Integer>map=new HashMap<>();
class Solution {
    public int largestInteger(int[] nums, int k) {
    boolean valid=false;
        if(valid){
        return max;
        }
