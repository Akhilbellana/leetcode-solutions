class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int ones = 0;
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        String best = "";
        while (j < s.length()) {
            char st = s.charAt(j);
            if (st == '1') {
                ones++;
            }
            while (ones > k) {
                if (s.charAt(i) == '1') {
                    ones--;

                }
                i++;
            }
            while (ones == k) {
                if (j - i + 1 < min) {
                    best = s.substring(i, j + 1);
                    min = j - i + 1;
                } else if (min == j - i + 1) {
                    for (int a = 0; a < min; a++) {
                        if (best.charAt(a) != s.charAt(a + i)) {
                            if (s.charAt(a + i) == '0') {
                                best = s.substring(i, j + 1);
                                
                            }
                            break;
                        }
                    }
                }
                if (s.charAt(i) == '1') {
                    ones--;
                }

                i++;
            }
            j++;
        }
        return best;

    }
}