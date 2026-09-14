class Solution {
    public String longestNiceSubstring(String s) {
        Set<Character>set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(!set.contains(Character.toLowerCase(s.charAt(j)))&&!set.contains(Character.
                    if(ans.length()<j-i){
                        ans=s.substring(i,j-1);
                    }
                }
            }
        }
        return ans;
    }
                toUpperCase(s.charAt(j)))){
}
