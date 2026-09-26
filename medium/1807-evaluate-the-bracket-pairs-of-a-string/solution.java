class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();

        int n = knowledge.size();

        for (List<String> str : knowledge) {
            map.put(str.get(0), str.get(1));
        }
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                StringBuilder temp = new StringBuilder();
                int j = i+1;
                while (j < s.length() && s.charAt(j) != ')') {
                    temp.append(s.charAt(j));
                    j++;
                }
                i = j;
                if (map.containsKey(temp.toString())) {
                    ans.append(map.get(temp.toString()));

                } else {
                    ans.append('?');
                }
            } else {
                ans.append(s.charAt(i));
            }
            i++;

        }
        return ans.toString();

    }
}