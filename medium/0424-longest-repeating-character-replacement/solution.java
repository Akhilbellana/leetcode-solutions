class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int maxfreq=0;
        int maxlen=0;
        int[] freq=new int[26];
        while(j<s.length()){
           freq[s.charAt(j)-'A']++;
           maxfreq=Math.max(maxfreq,freq[s.charAt(j)-'A']);
            while((j-i+1)-maxfreq>k){
                freq[s.charAt(i)-'A']--;
                i++;
                }  
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}