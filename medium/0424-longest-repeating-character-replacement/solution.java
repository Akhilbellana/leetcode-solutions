            int count=map.getOrDefault(s.charAt(j),0)+1;
            map.put(s.charAt(j),count);
            maxcount=Math.max(maxcount,count);
            while((j-i+1)-maxlen>k){
                map.put(s.charAt(i),count-1);
            }
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(j));
                }
                i++;
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        while(j<s.length()){
        int maxlen=0;
        int maxcount=0;
        int j=0;
        int i=0;
        }
        return maxlen;
