class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int i=k;
        int count=0;
        while(count==0){
            if(i%k==0 && !set.contains(i)){
                count++;
                return i;
            }
            i++;
        }
        return -1;
        
    }
}