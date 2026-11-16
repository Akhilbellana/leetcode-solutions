class Solution {
    public String digitSum(String s, int k) {
        String st = s;
        while (st.length() > k) {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < st.length(); i = i + k) {
                int sum = 0;
                if (i + k <= st.length()) {
                    for (int j = i; j < i + k; j++) {
                        sum += st.charAt(j) - '0';
                    }
                } else {
                    for (int j = i; j <= st.length() - 1; j++) {
                        sum += st.charAt(j) - '0';
                    }
                }
                list.add(String.valueOf(sum));
            }
            st = String.join("", list);

        }
        return st;

    }
}