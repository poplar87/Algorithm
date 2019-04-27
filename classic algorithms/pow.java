
      public double myPow(double x, int n) {
       if(n==0) return 1;
        boolean minN = false;
        if(n<0){
            x = 1/x;
            if(n == Integer.MIN_VALUE){ //如果是最大负数
                n = n+1; //把它变成正数能表示的范围
                minN = true;
            }
            n = -n;
        }
        double ans = (n%2==0)?myPow(x*x, n/2):x*myPow(x*x, n/2);
        if(!minN) return ans;
        else return ans * x;
    }
    
