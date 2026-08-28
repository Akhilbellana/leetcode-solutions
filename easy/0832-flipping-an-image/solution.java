
            }
                    image[i][left]=1;
                }else{
                    image[i][left]=1;
                }
                if(image[i][right]==0){
                    image[i][right]=1;
                }else{
                    image[i][right]=1;
                }

                int temp=image[i][left];
                image[i][left]=image[i][right];
                image[i][right]=temp;
        }

                left++;
                right--;
        return image;
                if(image[i][left]==0){
            while (left < right) {
            int right = image[i].length - 1;
