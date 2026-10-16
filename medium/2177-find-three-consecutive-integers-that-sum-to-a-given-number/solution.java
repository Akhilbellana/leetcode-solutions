class Solution {
    public long[] sumOfThree(long num) {
        if (num % 3 != 0) {
            return new long[] {};
        }
        long ans = (num / 3) - 1;
        return new long[] { ans, ans + 1, ans + 2 };
    }
}