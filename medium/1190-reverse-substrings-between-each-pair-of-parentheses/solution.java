class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(' || ch == ')') {
                count++;
            }
        }
        while (count > 0) {
            int temp1 = -1;
            int temp2 = -1;
                for(int i=0;i<sb.length();i++){
                    if(sb.charAt(i)=='('){
                        temp1=i;
                    }
                }
                for (int i = temp1 + 1; i < sb.length(); i++) {
                    if (sb.charAt(i) == ')') {
                        temp2 = i;
                        break;
                    }
                }
            int left = temp1 + 1;
            int right = temp2 - 1;
            while (left < right) {
                char ch1 = sb.charAt(left);
                char ch2 = sb.charAt(right);
                sb.setCharAt(right, ch1);
                sb.setCharAt(left, ch2);
                left++;
                right--;
            }
            sb.deleteCharAt(temp2);
            sb.deleteCharAt(temp1);

            count = count - 2;
        }
        return sb.toString();

    }
}