class Solution {
    public int reverseDegree(String s) {
        int prod=0;
        for(int i=0;i<s.length();i++){
            int val=26-(s.charAt(i)-'a');
            int index=i+1;
            prod+=val*index;
            
        }
        return prod;
        
    }
}