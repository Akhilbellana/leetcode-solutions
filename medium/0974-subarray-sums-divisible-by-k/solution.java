class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     Map<Integer,Integer>map=new HashMap<>();
     map.put(0,1);
     int sum=0;
     int count=0;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        int valid=sum%k;
        if(map.containsKey(valid)){
            count+=map.get(valid);
        }
        map.put(sum%k,map.getOrDefault(sum%k,0)+1);
     }
     return count++;
    }
}