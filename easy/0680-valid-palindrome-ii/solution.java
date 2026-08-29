class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean valid=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                int left=i+1;
                int right=j;
                boolean validleft=true;
                while(left<right){
                    if(s.charAt(left)!=s.charAt(right)){
                        validleft=false;
                        break;
                    }
                    left++;
                    right--;
                
                }
                 left=i;
                 right=j-1;
                 boolean validright=true;
                while(left<right){
                     if(s.charAt(left)!=s.charAt(right)){
                        validright=false;
                        break;
                     }
                     left++;
                     right--;

                }
                return validright||validleft;
                }
                    i++;
                    j--;
                
        }
            return true;

        
    }
}