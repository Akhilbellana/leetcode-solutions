        tot+=n;
       }
       int target=tot%p;
       if(target==0){
        return 0;
       }
       if(tot<p){
        return -1;
       }
       int sum=0;
       boolean valid=false;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           if(map.containsKey(sum-target) && map.get(sum-target)%p==0){
            min=Math.min(min,i-map.get(sum-target));
            valid=true;
           }
           map.put(sum,i);
       }
       if(valid){
        return min;
       }
       return -1;

