 public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int maxi=matrix.length-1;
        if(maxi==-1) return list;
        int maxj=matrix[0].length-1;
        
        int mini=0,minj=0;
        int i=0,j=-1;
        while(mini<=maxi&&minj<=maxj){
        for(j=minj;j<=maxj;j++)
            list.add(matrix[mini][j]);
            mini++;
        for(i=mini;i<=maxi;i++)
        list.add(matrix[i][maxj]);
            maxj--;
            if(mini<=maxi)
            { for(j=maxj;j>=minj;j--)
        list.add(matrix[maxi][j]);  
          maxi--;}
             if(minj<=maxj)
            {
        for(i=maxi;i>=mini;i--)
        list.add(matrix[i][minj]); 
            minj++;
        }}
        return list;
    }
