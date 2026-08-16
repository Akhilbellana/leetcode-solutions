       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            ones++;
        }
       }
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==0){
       }
            zeros++;
        }else{
            ones--;
        }
    }
        max=Math.max(max,zeros+ones);
       int max=0;
       return max;
        int ones=0;
    public int maxScore(String s) {
class Solution {
        int zeros=0;
