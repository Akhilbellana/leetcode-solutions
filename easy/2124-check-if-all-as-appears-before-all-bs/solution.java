class Solution {
    public boolean checkString(String s) {
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='b'){
                int j=i+1;
                while(j<s.length()){
                    if(s.charAt(j)=='a'){
                        return false;
                    }
                    j++;
                }
            }
            i++;
        }
        return true;
        
    }
}