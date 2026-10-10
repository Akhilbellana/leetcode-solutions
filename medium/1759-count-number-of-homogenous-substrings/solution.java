class Solution {
    public int countHomogenous(String s) {
        int i = 0;
        int j = 0;
        long count = 0;
        int m = (int) 1e9 + 7;
        while (j < s.length()) {
            if (j > 0 && s.charAt(j) != s.charAt(j - 1)) {
                count+=(long) (j - i) * (j - i + 1) / 2;
                count %= m;
                i = j;
            }

            j++;
        }
        count +=(long) (j - i) * (j - i + 1) / 2;
        count %= m;
        return (int)count;

    }
}