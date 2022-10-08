class Solution {
    public boolean isThree(int n) {
      int i=2;
       while(i*i<=n){
       if(n%i==0){
       return i*i==n;
      }
      i++;
    }
   return false;
    }}