class Solution {
   String str="aeiouAEIOU"; 
   public boolean halvesAreAlike(String s) {
      int mid=s.length()/2 , ans =0;
     for(int i=0, j=mid; i<mid;i++,j++){
       if(str.indexOf(s.charAt(i))>=0) ans++;
       if(str.indexOf(s.charAt(j))>=0) ans--;
       
     }
     return ans==0;
    }
}