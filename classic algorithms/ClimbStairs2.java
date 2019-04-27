public void climbStairs(int n){
if(n==0)return 0;
int sum=1;
for(int i=1;i<n;i++){
sum*=2;
}
return sum;
}
