        for(int size=1;size<=Math.min(n,m);size++){
        for(int r=0;r+size<=n;r++){
            for(int c=0;c+size<=m;c++){
                int r1=r;
                int r2=r+size-1;
                int c1=c;
                int c2=c+size-1;
                int sum=prefix[r2+1][c2+1]-prefix[r1][c2+1]-prefix[r2+1][c1]
                +prefix[r1][c1];
                if(sum<=threshold){
                    max=Math.max(max,size);
                }
            }
        }
        }
        return max;
        
    }
}
