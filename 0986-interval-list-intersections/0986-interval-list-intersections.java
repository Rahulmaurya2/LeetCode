class Solution {
    public int[][] intervalIntersection(int[][] f, int[][] s) {
     //if(f.length!=s.length) return new int[0][0];  
    /* List<int[]>list= new ArrayList<>();
      int i=0,j=0;
      while(i<f.length && j<s.length){
        int a=Math.max(s[i][0],f[j][0]);
        int b=Math.min(s[i][1],f[j][1]);
        
        if(a<=b){
         list.add(new int[]{a,b}); 
        }
       if(f[i][1]<s[j][1]){
         i++;
       }else {j++;}
      }
     */
      int i=0;
      int j=0;
      List<int[]> list = new ArrayList<>();
      while(i<f.length && j<s.length){
        int lower=Math.max(f[i][0],s[j][0]);
        int upper=Math.min(f[i][1],s[j][1]);
        if(lower<=upper){
          list.add(new int[]{lower,upper});
        }
        if(f[i][1]<s[j][1]) i++;
        else j++;
      }
      return list.toArray(new int[list.size()][]);
    }
}