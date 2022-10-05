class Solution {
    public int mySqrt(int x) {
        int i=1,j=x;
     while(i<j){
       int mid = i+(j-i)/2+1;
       if(mid>x/mid) j=mid-1;
       else i=mid;
     }
      return j;
    }
}