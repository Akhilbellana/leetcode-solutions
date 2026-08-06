class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq=new int[26];
        for(char ch:chars.toCharArray()){
            freq[ch-'a']++;
        }
        int res=0;
        boolean valid=true;
        for(String word : words){
            int[] temp=freq.clone();
            for(char ch:word.toCharArray()){
                if(temp[ch-'a']==0){
                    valid=false;
                    break;
                }
            }
