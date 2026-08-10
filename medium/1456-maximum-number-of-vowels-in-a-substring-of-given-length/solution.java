class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int v=0;
        int max=0;
        while(j<s.length()){
            char a=s.charAt(j);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                v++;
            }
            if(j-i+1==k){
                char b=s.charAt(i);
                max=Math.max(max,v);
                if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
                    v--;
                    i++;
                }else{
                    i++;
                }
            }
            j++;
        }
        return max;
    }
}