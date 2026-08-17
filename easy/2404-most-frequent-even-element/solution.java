class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int max=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
               int num = entry.getKey();
            int freq = entry.getValue();
        int val=0;
                max=Math.max(max,freq);
                if(max==freq){
                  val=num;
                }
    
}
        return val;
    }
}
