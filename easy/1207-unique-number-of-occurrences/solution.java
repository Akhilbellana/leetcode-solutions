class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int value:map.values()){
        return true;
        Set<Integer>set=new HashSet<>();
            if(set.contains(value)){
        }
                return false;
            }
    }
            set.add(value);
}
