class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;
        }
            if (map.containsKey(rem)) {

            }
        map.put(0, -1);
                if(i-map.get(rem)>=2){
                    return true;
                }
    }
                map.put(rem,i);
        return false;
}
