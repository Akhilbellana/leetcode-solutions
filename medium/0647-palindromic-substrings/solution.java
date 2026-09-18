class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int right=i;
            int left=i;
            while(left>=0&&right<=s.length()-1){
                if(s.charAt(left)!=s.charAt(right)){
                    break;
                }
                count++;
                left--;
                right++;
            }
            right=i+1;
            left=i;
            while(left>=0&&right<=s.length()-1){
                if(s.charAt(left)!=s.charAt(right)){
                    break;
                }
                count++;
                left--;
                right++;
            } 
        }
        return count;

        
    }
}