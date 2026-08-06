class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq=new int[26];
        for(char ch:chars.toCharArray()){
            freq[ch-'a']++;
        }
        int res=0;
        for(String word : words){
            boolean valid=true;
            int[] temp=freq.clone();
            for(char ch:word.toCharArray()){
                if(temp[ch-'a']==0){
                    valid=false;
                    break;
                }
            }
            if(valid){
                res+=word.length();
            }
        }
        return res;
    }
}