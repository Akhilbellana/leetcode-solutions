class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i=0;i<strs.length;i++){
            for(int j=1;j<strs.length;j++){
                  if(strs[0].charAt(i)==strs[j].charAt(i)){
            }
            }
        
        String s="";
                    s+=strs[0].charAt(i);
                  }else{
                    return "";
                  }
    }
        return s;
}
