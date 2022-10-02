class Solution {
    public int shipWithinDays(int[] w, int d) {
      int sum=0;
      for(int i=0; i<w.length;i++){
        sum+=w[i];
      }
      int lo=1; int hi=sum;
      while(lo<=hi){
        int mid = lo+(hi-lo)/2;
        if(isValid(w,d,mid))
          hi=mid-1;
        else lo=mid+1;
      }
      return lo;
    }
  public boolean isValid(int [] w,int d, int capacity){
    int dayNeed=0;
    int weightSum=0;
    for(int i=0; i<w.length; i++){
      if(w[i]>capacity) return false;
      
      weightSum+=w[i];
      if(weightSum>capacity) {
        ++dayNeed;
        weightSum=w[i];
      }
    }
    if(weightSum>0) 
      ++dayNeed;
    
    return dayNeed<=d;
  }
}