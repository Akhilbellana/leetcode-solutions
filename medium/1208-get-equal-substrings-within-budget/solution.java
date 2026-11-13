class Solution {
    public int equalSubstring(String s, String t, int maxcost) {
        int i = 0;
        int j = 0;
        int res = 0;
        int cost = 0;
        while (j < s.length()) {
            cost += ((Math.abs(s.charAt(j) - t.charAt(j))));
            while (cost > maxcost) {
                cost -= ((Math.abs(s.charAt(i) - t.charAt(i))));
                i++;
            }
            res = Math.max(res, j - i + 1);
            j++;
        }
        return res;

    }
}