class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        int maxcount=0;
        int maxlen=0;
        while(j<s.length()){
            int count=map.getOrDefault(s.charAt(j),0)+1;
            map.put(s.charAt(j),count);
            maxcount=Math.max(maxcount,count);
            while((j-i+1)-maxcount>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}