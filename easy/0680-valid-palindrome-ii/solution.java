class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean valid=true;
        while(i<j && valid){
            if(s.charAt(i)!=s.charAt(j)){
        }
        
                valid=false;
            }
            i++;
            j--;
        if(j-i==1){
            return true;
        }
    }
        return false;
}
