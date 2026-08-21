class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int i = 0;
        int j = 0;
        while (j < s2.length()) {
            freq[s2.charAt(j) - 'a']--;
            if (j - i + 1 == s1.length()) {
                boolean valid = true;
                for (int k = 0; k < freq.length; k++) {
                    if (freq[k] != 0) {
                        valid = false;
                        break;
                    }

                }
                if (valid) {
                    return true;
                } else {
                    freq[s2.charAt(i) - 'a']++;
                    i++;
                }
            }
            j++;
        }

        return false;
    }
}