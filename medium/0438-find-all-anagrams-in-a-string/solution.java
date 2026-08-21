class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq = new int[26];
        List<Integer> list = new ArrayList<>();
        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            freq[s.charAt(j) - 'a']--;
            if (j - i + 1 == p.length()) {
                boolean valid = true;
                for (int n : freq) {
                    if (n != 0) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    list.add(i);
                }
                freq[s.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return list;

    }
}