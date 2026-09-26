class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[]freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int val=freq[s.charAt(0)-'a'];
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']!=val){
                return false;
            }
        }
        return true;
        
    }
}