class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int max=0;
        int val=-1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
               int num = entry.getKey();
            int freq = entry.getValue();
                if(freq>max){
                    max=freq;
                  val=num;
                }else if(freq==max){
                    val=Math.min(val,num);
                }
    
}
        return val;
    }
}