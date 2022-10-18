class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
       int[] count=new int[100];
      int res=0;
      for(int[] d: dominoes){
        int up=d[0]<d[1]?d[0]:d[1];
        int down=d[0]<d[1]?d[1]:d[0];
        res+=count[up*10+down]++;
      }
      return res;
    }
}