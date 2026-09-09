class Solution {
    public long countCommas(long n) {
        long count = 0;
        long num = n;

        while (num > 999) {

            if (num <= 999999) {
                count += (num - 999);
                num = num - (num - 999);

            } else if (num <= 999999999) {
                count += (num - 999999) * 2;
                num = num - (num - 999999);

            } else if (num <= 999999999999L) {
                count += (num - 999999999) * 3;
                num = num - (num - 999999999);

            } else if (num <= 999999999999999L) {
                count += (num - 999999999999L) * 4;
                num = num - (num - 999999999999L);

            } else if (num <= 999999999999999999L) {
                count += (num - 999999999999999L) * 5;
                num = num - (num - 999999999999999L);

            } else {
                count += (num - 999999999999999999L) * 6;
                num = num - (num - 999999999999999999L);
            }
        }

        return count;
    }
}