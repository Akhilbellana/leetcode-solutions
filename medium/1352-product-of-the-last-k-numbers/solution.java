class ProductOfNumbers {
    int[]prefix=new int[40001];
    int index=0;
    public ProductOfNumbers() {
        prefix[0]=1;
    }
    
    public void add(int num) {
        if(num==0){
            index=0;
            prefix[0]=1;
        }else{
            prefix[index+1]=prefix[index]*num;
            index++;
        }
    }
    
    public int getProduct(int k) {
        if(k>index)return 0;
        return prefix[index]/prefix[index-k];
    }

}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */