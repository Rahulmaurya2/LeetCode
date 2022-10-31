class Solution {
    public int maxDistance(int[] c) {
        int max=Integer.MAX_VALUE, res=1;
      for(int i=1; i<c.length;i++){
        if(c[i]!=c[0]){
          max=Math.min(i,max);
          res=i;
        }else{
          res=Math.max(res,i-max);
        }
      }
      return res;
    }
}