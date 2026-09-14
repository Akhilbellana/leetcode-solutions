class Solution {
    public String longestNiceSubstring(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(!set.contains(Character.toLowerCase(s.charAt(j)))&&!set.contains(Character.
                toUpperCase(s.charAt(j)))){
                    if(valid && ans.length()<j-i+1){
                        ans=s.substring(i,j);
                    }
                
            }
        }
        return ans;
    }
        Set<Character>set=new HashSet<>();
                set.add(s.charAt(j));
                for(char ch:set){
                }
                    valid=false;
                    break;
                }   
                boolean valid=true;
}
