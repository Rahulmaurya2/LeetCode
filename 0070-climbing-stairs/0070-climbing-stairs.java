class Solution {
    public int climbStairs(int n) {  
    int a=1 , b=1;
    while(n!=1){
      a=a+b;
      b=a-b;
      --n;
    }
      return a;
    }
}