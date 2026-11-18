class Solution {
    public int minChanges(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i += 2) {
            int j = i + 1;
            if (s.charAt(i) != s.charAt(j)) {
                cnt++;
            }
        }
        return cnt;
    }
}