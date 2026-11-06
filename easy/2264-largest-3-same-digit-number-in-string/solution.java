class Solution {
    public String largestGoodInteger(String num) {
        String[] st = { "999", "888", "777", "666", "555", "444", "333", "222", "111", "000" };
        for (String n : st) {
            if (num.contains(n)) {
                return n;
            }
        }
        return "";

    }
}