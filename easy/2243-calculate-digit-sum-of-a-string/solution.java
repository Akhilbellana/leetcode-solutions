class Solution {
    public String digitSum(String s, int k) {
        String st = s;
        while (st.length() > k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < st.length(); i = i + k) {
                int sum = 0;
                for (int j = i; j < st.length() && j < i + k; j++) {
                    sum += st.charAt(j) - '0';
                }
                sb.append(sum);
            }
            st = sb.toString();

        }
        return st;

    }
}