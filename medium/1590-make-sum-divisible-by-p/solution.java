        return 0;
       }
       int sum=0;
       boolean valid=false;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           if(map.containsKey(req)){
            min=Math.min(min,i-map.get(req));
            valid=true;
           }
           map.put(sum%p,i);
       }
       if(valid){
        return min;
       }
       return -1;
           int req=(sum%p-target+p)%p;
    }
}
       if(target==0){
       int target=tot%p;
       }
