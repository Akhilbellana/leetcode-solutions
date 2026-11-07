class Solution {
    public int numSpecialEquivGroups(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                //separate even and odd characters to string and sort 
                // because they said we can only swap odd to odd and even to odd , so we separated odd an even characters 
                if (i % 2 == 0) {
                    even.append(s.charAt(i));
                } else {
                    odd.append(s.charAt(i));
                }
            }
            char[] ch1 = even.toString().toCharArray();
            char[] ch2 = odd.toString().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            String temp1 = Arrays.toString(ch1);
            String temp2 = Arrays.toString(ch2);
            map.put(temp1 + temp2, map.getOrDefault(temp1 + temp2, 0) + 1);
        }
        return map.size();

    }
}