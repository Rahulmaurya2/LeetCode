class Solution {
    public boolean isSameAfterReversals(int num) {
    /* int sum=0, sum1=0; int rev=0, rev1=0;
     while(num!=0){
       int rem=num%10;
       rev=rev*10+rem;
       int rem1=rev%10;
       sum1+=rem1;
       
       num/=10;
     }
      return(sum==sum1);*/
      if(num%10==0 && num!=0) return false;
      return true;
    }
}