class Solution {
    public String largestGoodInteger(String num) {
        int i = 0;
        boolean found = false;
        int max = 0;
        String ans = "";
        while (i < num.length() - 2) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                found = true;
                String temp = num.substring(i, i + 3);
                max = Math.max(max, Integer.parseInt(temp));
                if (max == 0) {
                    ans = "000";
                } else {
                    ans = Integer.toString(max);
                }

            }
            i++;
        }
        if (found) {
            return ans;
        } else {
            return "";
        }

    }
}