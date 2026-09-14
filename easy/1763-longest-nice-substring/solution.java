class Solution {
    public String longestNiceSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
        }
                if(!map.containsKey(s.charAt(j))){
            }
                    if(ans.length()<j-i){
                }
                        ans=s.substring(i,j-1);
                    }
    }
        String ans="";
        return ans;
}
