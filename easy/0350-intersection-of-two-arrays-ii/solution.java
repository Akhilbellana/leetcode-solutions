class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        if(nums1.length>nums2.length){
             for(int x:nums1){
                map.put(x,map.getOrDefault(x,0)+1);
             }
             for(int x:nums2){
                if(map.containsKey(x)){
                    list.add(x);
                    map.put(x,map.get(x)-1);
                    if(map.get(x)==0){
                        map.remove(x);
                    }
                }
             }
        }else{
            for(int x:nums2){
                map.put(x,map.getOrDefault(x,0)+1);
             }
             for(int x:nums1){
                if(map.containsKey(x)){
                    list.add(x);
                    map.put(x,map.get(x)-1);
                    if(map.get(x)==0){
                        map.remove(x);
                    }
                }
             }

        }
        int[] a=new int[list.size()];
        int i=0;
        for(int x:list){
           a[i]=x;
           i++;
        }
        return a;
        
    }
}