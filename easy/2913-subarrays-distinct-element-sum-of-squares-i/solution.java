class Solution {
    public int sumCounts(List<Integer> nums) {
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            boolean[] visited = new boolean[101];
            int count = 0;
            for (int j = i; j < nums.size(); j++) {
                int num = nums.get(j);
                if (!visited[num]) {
                    visited[num] = true;
                    count++;
                }
                res += count * count;
            }
        }
        return res;

    }
}