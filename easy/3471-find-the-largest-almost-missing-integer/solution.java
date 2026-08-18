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
        if(valid){
        return max;
        }
        return -1;
    }
}
            Set<Integer>set=new HashSet<>();
        for(int i=0;i<=nums.length-k;i++){
    Map<Integer,Integer>map=new HashMap<>();
    boolean valid=false;
