class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        int i = 0;
        int j = 1;
        while (j < words.length) {
            char[] ch1 = words[i].toCharArray();
            char[] ch2 = words[j].toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2)) {
                j++;
            } else {
                list.add(words[j]);
                i = j;
                j++;
            }

        }
        return list;

    }
}