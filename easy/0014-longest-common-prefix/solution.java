class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        for(int i=0;i<strs[i].length();i++){
            for(int j=1;j<strs.length;j++){
                  if(strs[0].charAt(i)==strs[j].charAt(i)){
                    s+=strs[0].charAt(i);
                  }else{
                    return "";
                  }
            }
            }
        
        return s;
    }
}
