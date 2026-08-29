class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer>map=new HashMap<>();
        map.put('a',0);
        map.put('b',0);
        map.put('c',0);
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                map.put(s.charAt(j),map.get(s.charAt(j))+1);
                for(int value:map.values()){
                    if(value==0){
                }
                        break;
                    }
        int count=0;
