class Solution {
    public int countHomogenous(String s) {
        int i = 0;
        int j = 0;
        int count = 0;
        int m = (int) 1e9 + 7;
        while (j < s.length()) {
            if (j > 0 && s.charAt(j) != s.charAt(j - 1)) {
                i = j;
            }
            count += j - i + 1;
            count %= m;
            j++;
        }
        return count;

    }
}