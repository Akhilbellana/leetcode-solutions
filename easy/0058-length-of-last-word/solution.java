class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        int len=words[words.length-1].length();
        return len;
    }
}