            int count=map.getOrDefault(s.charAt(j),0)+1;
            map.put(s.charAt(j),count);
            maxcount=Math.max(maxcount,count);
            while((j-i+1)-maxcount>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
            }
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
        while(j<s.length()){
        int maxlen=0;
        int maxcount=0;
        int j=0;
        int i=0;
        Map<Character, Integer>map=new HashMap<>();
    public int characterReplacement(String s, int k) {
            maxlen=Math.max(maxlen,j-i+1);
