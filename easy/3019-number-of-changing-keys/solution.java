class Solution {
    public int countKeyChanges(String s) {
        int res = 0;
        int i = 0;
        int j = 1;
        s = s.toLowerCase();
        while (j < s.length()) {
            if (s.charAt(i) != s.charAt(j)) {
                res++;
            }
            i++;
            j++;
        }
        return res;

    }
}