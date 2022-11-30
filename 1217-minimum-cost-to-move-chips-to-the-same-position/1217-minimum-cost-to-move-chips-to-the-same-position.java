class Solution {
    public int minCostToMoveChips(int[] p) {
      int count=0;
      int i=0;
      while(i<p.length){
        if(p[i]%2==0) count++;
        i++;
      }
      return Math.min(count,p.length-count);
    }
}