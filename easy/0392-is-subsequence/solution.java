class Solution {
    public boolean isSubsequence(String s, String t) {
        String ans="";
        int i=0;
        int j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                ans+=t.charAt(j);
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(s.equals(ans)){
            return true;
        }
        return false;
        
    }
}