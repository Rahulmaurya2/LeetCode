class Solution {
    public int countOperations(int num1, int num2) {
        int count=0;
      while(num2!=0&&num1!=0){
       if(num1<num2){
         count+=num2/num1;
         num2%=num1;
       }else{
         count+=num1/num2;
         num1%=num2;
       }
      }
      return count;
    }
}