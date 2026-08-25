class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int i=1;
        int val=k;
        while(set.contains(val)){
            val=i*k;
            i++;
        }
        return val;
        
    }
}
