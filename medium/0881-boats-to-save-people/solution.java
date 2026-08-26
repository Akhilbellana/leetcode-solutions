class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:people){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int c=0;
        int i=0;
        int j=people.length-1;
        Arrays.sort(people);
        while(i<=j){
            if(people[i]+people[j]<=limit){
                j--;
                i++;
            }else{
                j--;
            }
            c++;
        }
        return c;
        
    }
}