class Solution {
    public int reverseDegree(String s) {
        int prod=0;
        for(int i=1;i<=s.length();i++){
            prod+=i*(Math.abs(s.charAt(i-1)-'z')+1);
        }
        return prod;
        
    }
}