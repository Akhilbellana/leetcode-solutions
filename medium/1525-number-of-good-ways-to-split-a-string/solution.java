class Solution {
    public int numSplits(String s) {
        int count = 0;
        int[] prefix = new int[s.length()];
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            prefix[i] = map1.size();
        }
        int[] suffix = new int[s.length()];
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = s.length() - 1; i > 0; i--) {
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
            suffix[i] = map2.size();
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (prefix[i] == suffix[i + 1]) {
                count++;
            }
        }
        return count;

    }
}