class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int sums = 0;
        int min=Integer.MAX_VALUE;
        boolean valid=false;
        while(j < nums.size()) {
            sum += nums.get(j);
            if (j - i + 1 == l) {
                if (sum > 0) {
                    min = Math.min(min, sum);
                    valid=true;
                }
                sums = sum;
                int x = j+1;
                int y=0;
                while(y<r-l && x<nums.size()){
                    sums += nums.get(x);
                    if (sums > 0) {
                        min = Math.min(min, sums);
                    }
                    y++;
                    x++;
                }

                sum -= nums.get(i);
                i++;
            }
            j++;
        }if(valid){
        return min;
        }
        return -1;
    }
}