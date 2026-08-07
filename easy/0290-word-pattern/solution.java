        }
            }
              map1.put(words[i],s.charAt(i));  
            }else{
        Map<Character,String>map2=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map2.containsKey(s.charAt(i))){
                if((map2.get(s.charAt(i))!=words[i])){
                    return false;
                }
            }else{
                map2.put(s.charAt(i),words[i]);
            }
        }
        return true;
    }
