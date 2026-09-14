class Solution {
    public String longestNiceSubstring(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
        Set<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                set.add(s.charAt(j));
                boolean valid=true;
                for(char ch:set){
                if(!set.contains(Character.toLowerCase(s.charAt(j)))&&!set.contains(Character.
                toUpperCase(s.charAt(j)))){
                    valid=false;
                    break;
                }
                }   
                    if(valid && ans.length()<j-i+1){
                        ans=s.substring(i,j+1);
                    }
                
            }
        }
        return ans;
    }
}
