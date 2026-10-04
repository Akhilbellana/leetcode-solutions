class Solution {
    public int minRotations(String s) {
        int count=0;
        int pointer=0;
        for(int i=0;i<s.length();i++){
            int a=Math.abs((s.charAt(i)-'0')-pointer);
            count+=Math.min(a,10-a);
           pointer=s.charAt(i)-'0';
        }
        return count;
        
    }
}