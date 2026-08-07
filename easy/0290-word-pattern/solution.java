class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String,Character>map1=new HashMap<>();
        String[] words=s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<words.length;i++){
            if(map1.containsKey(words[i])){
                if(!(map1.get(words[i])).equals(pattern.charAt(i))){
                    return false;
                }    
            }else{
              map1.put(words[i],pattern.charAt(i));  
            }
        }
        Map<Character,String>map2=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map2.containsKey(pattern.charAt(i))){
                if(!(map2.get(pattern.charAt(i)).equals(words[i]))){
                    return false;
                }
            }else{
                map2.put(pattern.charAt(i),words[i]);
            }
        }
        return true;
    }
}