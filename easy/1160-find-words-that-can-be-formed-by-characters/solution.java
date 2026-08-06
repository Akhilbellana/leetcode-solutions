class Solution {
    public int countCharacters(String[] words, String chars) {
       Map<Character,Integer>map=new HashMap<>();
       for(char ch:chars.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       int res=0;
       for(String word:words){
        Map<Character,Integer>temp=new HashMap<>(map);
        boolean valid=true;
        for(char ch:word.toCharArray()){
            if(!temp.containsKey(ch)){
                valid=false;
                break;
            }
           temp.put(ch,temp.get(ch)-1);
           if(temp.get(ch)==0){
            temp.remove(ch);
           }
        }
        if(valid){
            res+=word.length();
        }
       }
       return res;
    }
}