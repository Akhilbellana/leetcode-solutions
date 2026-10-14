class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int nines = sum / 9;
        int rem = sum % 9;
        if (rem == 0) {
            if (nines > num) {
                return "";
            }
        } else {
            if (nines + 1 > num) {
                return "";
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nines; i++) {
            sb.append('9');
        }
        if (rem != 0) {
            sb.append(rem);
        }
        while (sb.length() < num) {
            sb.append('0');
        }
        return sb.toString();

    }
}