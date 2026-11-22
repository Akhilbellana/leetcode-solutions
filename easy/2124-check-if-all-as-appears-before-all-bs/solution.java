class Solution {
    public boolean checkString(String s) {
        boolean valid = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'a') {
                valid = true;
            }
            if (valid && s.charAt(i) == 'b') {
                return false;
            }
        }
        return true;

    }
}