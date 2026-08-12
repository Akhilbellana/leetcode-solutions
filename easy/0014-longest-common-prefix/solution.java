class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                  if(strs[0].charAt(i)!=strs[j].charAt(i)){
                       return "";
                  }
            }
            }
        
        return s;
    }
            s+=strs[0].charAt(i);
}
