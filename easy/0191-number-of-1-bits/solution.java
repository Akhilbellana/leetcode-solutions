class Solution {
    public int hammingWeight(int n) {
        for(int i=0;i<31;i++){
            if((n & (1<<i))!=0){
                count++;
            }
        }
        
    }
        int count=0;
        return count;
}
