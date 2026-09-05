class Solution {
    public String toLowerCase(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z'){
            ch=(char)(ch-'A'+'a');
            arr[i]=ch;
        }
        }
        return new String(arr);
        
    }
}