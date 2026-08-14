class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        int len=0;
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(map.get(s.charAt(j))>2){
               map.put(s.charAt(i),map.get(s.charAt(i))-1);
            //    if(map.get(s.charAt(i))==0){
            //     map.remove(s.charAt(i));
            //    }
                 i++;
               
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}