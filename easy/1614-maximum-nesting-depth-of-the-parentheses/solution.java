class Solution {
    public int maxDepth(String s) {
        int max=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count1++;
            }
            if(s.charAt(i)==')'){
                count2++;
            }
            max=Math.max(max,Math.abs(count1-count2));
            
        }
        return max;
        
    }
}