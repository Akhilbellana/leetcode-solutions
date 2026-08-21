class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(char ch:p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0;
        int j=0;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
            }
            if(j-i+1==p.length()){
                boolean valid=true;
                for(int values:map.values()){
                    if(values!=0){
                        valid=false;
                    }
                }
                if(valid){
                    list.add(i);
                }
                if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
                i++;
            }
            j++;
        }
        return list;
        
    }
}