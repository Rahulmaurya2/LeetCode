class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
      HashMap<Integer, Integer> hm = new HashMap<>();
      for(int i=0; i<deck.length;i++){
        hm.put(deck[i],hm.getOrDefault(deck[i],0)+1);
      }
      int ans=0;
      for(int k:hm.keySet()){
        ans=gcd(ans,hm.get(k));
      }
      return ans>=2 ? true:false;
    }
      /*int count=0 , res=0;
      Arrays.sort(deck);
      if(deck.length<2) return false;
      for(int i=1; i<deck.length;i++){
        if(deck[i-1]==deck[i]){ 
          count++; //res++;
        }else {
          res=count;
          count=0;
        }
      }
     return count==res;*/
    
  public int gcd(int a, int b){
    if(b==0){ 
      return a;
    }
    return gcd(b,a%b);
  }
}