                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int max=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
               int num = entry.getKey();
            int freq = entry.getValue();
        int val=-1;
                if(freq>max){
                  val=num;
                }else if(freq==max){
    
}
        return val;
                    val=Math.min(val,num);
                }
    }
                    max=freq;
}
            if(nums[i]%2==0){
        for(int i=0;i<nums.length;i++){
        Map<Integer,Integer>map=new HashMap<>();
