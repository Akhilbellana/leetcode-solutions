class Solution {
    public int maxDepth(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int j=i;
            int count1=0;
            int count2=0;
               while(j>=0){
                if(s.charAt(j)=='('){
                    count1++;

                }
                if(s.charAt(j)==')'){
                    count2++;
                }
                j--;
            }
            max=Math.max(max,Math.abs(count1-count2));
            
        }
        return max;
        
    }
}