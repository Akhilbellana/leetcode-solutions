class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        int write=0;
        while(j<chars.length){
            if(chars[i]!=chars[j]){
                chars[write]=chars[i];
                write++;
                if(j-i>1 &&j-i<=9){
                    chars[write]=(char)('0'+j-i);
                    write++;
                }else if(j-i>=10){
                    String s=String.valueOf(j-i);
                    for(int k=0;k<s.length();k++){
            chars[write]=s.charAt(k);
                 write++;
            }
                }
                i=j;
            }
            j++;
        }
        chars[write]=chars[i];
        write++;
        if((j-i)>1 &&j-i<=9){
        chars[write]=(char)('0'+j-i);
        write++;
        }else if(j-i>=10){
            String s=String.valueOf(j-i);
            for(int k=0;k<s.length();k++){
            chars[write]=s.charAt(k);
                 write++;
            }
        }
        return write;
    }
}