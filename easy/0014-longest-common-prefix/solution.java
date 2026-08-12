class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i=1;i<strs.length;i++){
            for(int j=0;j<strs.length;j++){
                  if(strs[0].charAt(j)==strs[i].charAt(j)){
            }
            }
        
        String s="";
                    s+=strs[i].charAt(j);
                  }else{
                    return "";
                  }
    }
        return s;
}
