                count++;
            }else{
                sb.append(chars[i]);
                if(count>1){
                   sb.append(count);
                }
            if(chars[i]==chars[i+1]){
                   count=1;
            }
       } 
       for(int i=0;i<chars.length-1;i++){
       sb.append(chars[chars.length-1]);
       if(count>1){
        sb.append(count);
       }
       for(int i=0;i<sb.length();i++){
        int count=1;
        StringBuilder sb=new StringBuilder();
    public int compress(char[] chars) {
class Solution {
