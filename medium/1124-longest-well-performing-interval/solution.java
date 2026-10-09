class Solution {
    public int longestWPI(int[] hours) {
        int max = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] > 8) {
                hours[i] = 1;
            } else {
                hours[i] = -1;
            }
            sum += hours[i];
            if (sum > 0) {
                max = Math.max(max, i+1);
            } else {
                for(int prevsum :map.keySet()){
                    if(prevsum<sum){
                        max=Math.max(max,i-map.get(prevsum));
                    }
                }
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max;

    }
}