class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int i=0;
        int j=0;
        int len=0;
        while(j<s.length()){
            freq[s.charAt(j)-'a']++;
            while(freq[s.charAt(j)-'a']>2){
               freq[s.charAt(i)-'a']--;
                 i++;
               
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}