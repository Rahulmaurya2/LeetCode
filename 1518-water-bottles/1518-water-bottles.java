class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       
      int n=numBottles;
      int sum=0;
      while(numBottles>=numExchange){
          sum = numBottles/numExchange;
          n+=sum;
          numBottles=sum+(numBottles % numExchange);
         
        }
      return n;
    }
}