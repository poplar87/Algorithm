 public static boolean Find(int target, int [][] array) {
       boolean find=false;
        int cols=array[0].length;
        int rows=array.length;
        int row=0,col=cols-1;       while(row<rows && col>=0){
                                if(array[row][col]==target){
                                    find=true;
                                    break;
                                    }
                                else if(array[row][col]>target){
                                    col--;
                                    }
                    else if(array[row][col]<target){
                        row++;
                        }
                }
return find;
       }
