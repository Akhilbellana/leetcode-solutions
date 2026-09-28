class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
         int count=0;
         int maxcount=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int x=n;
                count=0;
                while(set.contains(x)){
                    x++;
                    count++;
                }
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}