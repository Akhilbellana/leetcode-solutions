class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int count = k;
        int[] a = new int[k];
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < nums.length + 1; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            int num = entry.getKey();
            bucket[freq].add(num);
        }
        int index = 0;
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            for (int n : bucket[i]) {
                a[index] = n;
                index++;
            }
        }
        return a;

    }
}