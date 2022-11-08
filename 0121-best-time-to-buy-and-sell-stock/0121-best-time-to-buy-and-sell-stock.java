class Solution {
    public int maxProfit(int[] price) {
      int lsf=Integer.MAX_VALUE;
      int overall=0;
      int todayProfit=0;
      for(int i=0;i<price.length;i++){
        if(price[i]<lsf) lsf=price[i];
        todayProfit=price[i]-lsf;
        if(todayProfit>overall){
          overall=todayProfit;
        }
      }
      return overall;
    }
}