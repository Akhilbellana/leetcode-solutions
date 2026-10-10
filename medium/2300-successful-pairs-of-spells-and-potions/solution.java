class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int ans = 0;
            int l = 0;
            int h = potions.length - 1;
            while (l <= h) {
                int m = l + (h - l) / 2;
                if ((long)spells[i] * potions[m] >= success) {
                    ans = potions.length - m;
                    h = m - 1;
                } else {
                    l = m + 1;
                }
            }
            res[i] = ans;

        }
        return res;

    }
}