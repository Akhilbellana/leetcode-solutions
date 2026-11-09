class Solution {
    public int numSplits(String s) {
        int count = 0;
        int[] suffix = new int[s.length()];
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = s.length() - 1; i > 0; i--) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            suffix[i] = map1.size();
        }
        Map<Character, Integer> prefix = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            prefix.put(s.charAt(i), prefix.getOrDefault(s.charAt(i), 0) + 1);
            if (prefix.size() == suffix[i + 1]) {
                count++;
            }
        }
        return count;

    }
}