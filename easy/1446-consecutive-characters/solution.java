class Solution {
    public int maxPower(String s) {
        int i = 0;
        int count = 1;
        int max = 0;
        while (i < s.length() - 1) {
            char ch = s.charAt(i);
            if (s.charAt(i) != s.charAt(i + 1)) {
                max = Math.max(count, max);
                count = 1;
            } else {
                count++;
            }
            i++;
        }
        max = Math.max(max, count);
        return max;

    }
}