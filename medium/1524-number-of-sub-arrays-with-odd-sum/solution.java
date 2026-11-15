class Solution {
    public int numOfSubarrays(int[] arr) {
        int count=0;
        int m=(int)1e9+7;
        int[]prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int odd = 0;
        int even =1;
        for (int i = 0; i < arr.length; i++) {
            if(prefix[i]%2==0){
                count=(count+odd)%m;
                even++;
            }else{
                count=(count+even)%m;
                odd++;
            }
        }
        return count;

    }
}