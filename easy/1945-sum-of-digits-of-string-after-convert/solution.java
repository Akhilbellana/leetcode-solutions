class Solution {
    public int getLucky(String s, int k) {
        String str = "";
        for (char ch : s.toCharArray()) {
            str += (ch - 'a' + 1);
        }
        int sum=0;
        while(k>0){
            sum=0;
            for(char ch:str.toCharArray()){
                int n=ch-'0';
                sum+=n;
            }
             str = String.valueOf(sum);
             k--;

        }
        return Integer.parseInt(str);
        
    }
}