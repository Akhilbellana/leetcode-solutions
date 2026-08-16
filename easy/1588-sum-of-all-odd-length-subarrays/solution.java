class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if((j-i)%2==1){
            }
        }
                   sum+=prefix[j+1]-prefix[i];
                }
        for(int i=0;i<arr.length;i++){
        return sum;
             prefix[i+1]=prefix[i]+arr[i];
        }
    }
        int[] prefix=new int[arr.length+1];
}
