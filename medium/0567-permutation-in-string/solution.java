class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0;
        int j=0;
        while(j<s2.length()){
            if(map.containsKey(s2.charAt(j))){
                map.put(s2.charAt(j),map.get(s2.charAt(j))-1);
            }
            if(j-i+1==s1.length()){
                boolean valid=true;
                for(int values:map.values()){
                    if(values!=0){
                         valid=false;
                         break;
                    }
                }
                if(valid){
                    return true;
                }else{
                    if(map.containsKey(s2.charAt(i))){
                        map.put(s2.charAt(i),map.get(s2.charAt(i))+1);
                    }
                    i++;
                }
            }
            j++;
        }
        return false;

    }
}