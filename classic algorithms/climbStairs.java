public int climbStairs(int n) {
        
        if(n<=2)return n;
        int a=1,b=2;
        while(n-->2){
            int sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
