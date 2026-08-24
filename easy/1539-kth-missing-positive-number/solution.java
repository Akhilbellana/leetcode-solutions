class Solution {
    public int findKthPositive(int[] arr, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        List<Integer>list=new ArrayList<>();
        for(int n:arr){
            list.add(n);
        }
        int count=0;
        int n=1000;
        for(int i=1;i<=n;i++){
            if(!list.contains(i)){
                count++;
            }
            if(count==k){
                return i;
            }
        }
        return -1;
        
    }
}