class Solution {
    public int findLeastNumOfUniqueInts(int[] a, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int val : map.values()) {
            list.add(val);
        }
        int ans = 0;
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (k >= list.get(i)) {
                k = k - list.get(i);
            } else {
                return list.size() - i;
            }
        }
        return ans;
    }
}