class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String ans="";
        for(int i=0;i<s.length();i++){
                int left=i;
                int right=i;
                while(left>=0&&right<=s.length()-1){
                    if(s.charAt(left)!=s.charAt(right)){
                        break;
                    }
                    left--;
                    right++;
                }
                if((right-left-1)>ans.length()){
                    ans=s.substring(left+1,right);    
                }

                left=i;
                right=i+1;
                while(left>=0&&right<=s.length()-1){
                    if(s.charAt(left)!=s.charAt(right)){
                        break;
                    }
                    left--;
                    right++;
            }
                if((right-left-1)>ans.length()){
                    ans=s.substring(left+1,right);    
                }

        }
            
            return ans;
        
    }
}